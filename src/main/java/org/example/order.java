package org.example;

public class order {

    private int orderId;
    private String orderStatus;


    public order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;

    }

        public int getOrderId() {
            return orderId;
        }
        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

    public String getOrderStatus() {
        return orderStatus;
    }


        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }


    }





