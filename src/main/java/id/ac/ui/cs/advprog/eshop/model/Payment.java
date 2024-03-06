package id.ac.ui.cs.advprog.eshop.model;

import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;
import id.ac.ui.cs.advprog.eshop.enums.PaymentStatus;
import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter @Setter
public class Payment {
    String id;
    String method;
    String status;
    Map<String, String> paymentData;

    public Payment(String id, Map<String, String> paymentData) {
        this.id = id;
        this.method = methodDeterminer(paymentData);

        if (this.method.equals("voucherMethod")) {
            this.status = statusDeterminerVoucher(paymentData);
        } else if (this.method.equals("bankMethod")) {
            this.status = statusDeterminerBank(paymentData);
        } else {
            this.status = PaymentStatus.REJECTED.getValue();
        }

        this.paymentData = paymentData;

    }

    private String methodDeterminer(Map<String, String> paymentData) {
        if (paymentData.keySet().iterator().next().equals("voucherCode")) {
            return "voucherMethod";
        } else if (paymentData.keySet().iterator().next().equals("bankName")) {
            return "bankMethod";
        }
        return null;
    }

    private String statusDeterminerBank(Map<String, String> paymentData) {
        if (isPaymentDataValid(paymentData)) {
            return PaymentStatus.SUCCESS.getValue();
        } else {
            return PaymentStatus.REJECTED.getValue();
        }
    }

    private static boolean isPaymentDataValid(Map<String, String> paymentData) {
        if (paymentData == null) {
            return false;
        }

        for (String value : paymentData.values()) {
            if (value == null) {
                return false;
            }
        }

        return true;
    }

    private String statusDeterminerVoucher(Map<String, String> paymentData) {
        if (isValidVoucherCode(paymentData.get("voucherCode"))){
            return PaymentStatus.SUCCESS.getValue();
        } else {
            return PaymentStatus.REJECTED.getValue();
        }
    }

    private static boolean isValidVoucherCode(String voucherCode) {
        if (voucherCode.length() != 16) {
            return false;
        }

        if (!voucherCode.startsWith("ESHOP")) {
            return false;
        }

        String numericalPart = voucherCode.substring(4);
        return isNumeric(numericalPart);
    }

    private static boolean isNumeric(String str) {
        // Check if the string contains only numerical characters
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public void setStatus(String status) {
        if (PaymentStatus.contains(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException();
        }
    }


}
