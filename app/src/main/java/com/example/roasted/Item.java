package com.example.roasted;

public class Item {

        private int productCode;
        private String productName;
        private String productDes;
        private double productPricePer4;
        private boolean inStock;

//    public Item(int pCode,String pName,String pDes,
//                double pPrice) {
//        this.productCode = pCode;
//        this.productName = pName;
//        this.productDes = pDes;
//        this.productPricePer4 = pPrice;
       // this.inStock = stock;


    public boolean isInStock() {
            return inStock;
    }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public int getProductCode() {
            return productCode;
        }

        public void setProductCode(int productCode) {
            this.productCode=productCode;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductDes() {
            return productDes;
        }

        public void setProductDes(String productDes) {
            this.productDes = productDes;
        }

        public double getProductPricePer4() {
            return productPricePer4;
        }

        public void setProductPricePer4(double productPricePer4) {
            this.productPricePer4 = productPricePer4;
        }

    }


