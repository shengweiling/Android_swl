package test.swl.com.myapplication.modle;

import java.util.List;

public class PersonInfoBean extends BaseBean{
    /**
     * response : {"name":"","nickname":"行云sdfe","integral":"177449.25886719","totalintegral":"177449.25886719","totalcny":"144133.3410987116","sex":"男","height":"170","weight":"120","token":null,"img":"http://devapp.mcsports.cn:86/photos/default_head_icon.png","imgStatus":1,"birthday":"1990-01-01","mobile":"ux1hC1gcYd5aL0Hz5jP4prRvNcWHZ1c9QUZbqX+9cqp4+7y+VsYO/9STgc9T5Ioj5wYvF9lvcbV9X65b1jMOTuH0chZXtt26aRl71ORw0YpxprWi1w83PL5iAX9QWNzMW656QKme3S8YF4Otc8Sim6wGZqsx73SfoTkXx30Bn5M=","passwordStatus":1,"isRealNameAuth":0,"qqStatus":0,"weixinStatus":0,"weiboStatus":0,"pendingPaymentCount":0,"shipmentPendingCount":0,"receiveCount":0,"completeCount":0,"walletaddress":"M6C31VgYczKoPQzJJKhMKxd3eLfK9JZUDnM","questionId":"50","wallet":[{"cny":"140184.9145050801","name":"MCC","cimg":"http://devapp.mcsports.cn:86/photos/MCC.png","integral":"177449.25886719"},{"cny":"3948.4265936315005","name":"Nano","cimg":"http://devapp.mcsports.cn:86/photos/Nano.png","integral":"78968.53187263"},{"cny":"0","name":"MAC","cimg":"http://devapp.mcsports.cn:86/photos/MAC.png","integral":"0.0"},{"cny":"0","name":"AFC","cimg":"http://devapp.mcsports.cn:86/photos/AFC.png","integral":"0.0"}]}
     */

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {
        @Override
        public String toString() {
            return "ResponseBean{" +
                    "name='" + name + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", integral='" + integral + '\'' +
                    ", totalintegral='" + totalintegral + '\'' +
                    ", totalcny='" + totalcny + '\'' +
                    ", sex='" + sex + '\'' +
                    ", height='" + height + '\'' +
                    ", weight='" + weight + '\'' +
                    ", token=" + token +
                    ", img='" + img + '\'' +
                    ", imgStatus=" + imgStatus +
                    ", birthday='" + birthday + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", passwordStatus=" + passwordStatus +
                    ", isRealNameAuth=" + isRealNameAuth +
                    ", qqStatus=" + qqStatus +
                    ", weixinStatus=" + weixinStatus +
                    ", weiboStatus=" + weiboStatus +
                    ", pendingPaymentCount=" + pendingPaymentCount +
                    ", shipmentPendingCount=" + shipmentPendingCount +
                    ", receiveCount=" + receiveCount +
                    ", completeCount=" + completeCount +
                    ", walletaddress='" + walletaddress + '\'' +
                    ", questionId='" + questionId + '\'' +
                    ", wallet=" + wallet +
                    '}';
        }

        /**
         * name :
         * nickname : 行云sdfe
         * integral : 177449.25886719
         * totalintegral : 177449.25886719
         * totalcny : 144133.3410987116
         * sex : 男
         * height : 170
         * weight : 120
         * token : null
         * img : http://devapp.mcsports.cn:86/photos/default_head_icon.png
         * imgStatus : 1
         * birthday : 1990-01-01
         * mobile : ux1hC1gcYd5aL0Hz5jP4prRvNcWHZ1c9QUZbqX+9cqp4+7y+VsYO/9STgc9T5Ioj5wYvF9lvcbV9X65b1jMOTuH0chZXtt26aRl71ORw0YpxprWi1w83PL5iAX9QWNzMW656QKme3S8YF4Otc8Sim6wGZqsx73SfoTkXx30Bn5M=
         * passwordStatus : 1
         * isRealNameAuth : 0
         * qqStatus : 0
         * weixinStatus : 0
         * weiboStatus : 0
         * pendingPaymentCount : 0
         * shipmentPendingCount : 0
         * receiveCount : 0
         * completeCount : 0
         * walletaddress : M6C31VgYczKoPQzJJKhMKxd3eLfK9JZUDnM
         * questionId : 50
         * wallet : [{"cny":"140184.9145050801","name":"MCC","cimg":"http://devapp.mcsports.cn:86/photos/MCC.png","integral":"177449.25886719"},{"cny":"3948.4265936315005","name":"Nano","cimg":"http://devapp.mcsports.cn:86/photos/Nano.png","integral":"78968.53187263"},{"cny":"0","name":"MAC","cimg":"http://devapp.mcsports.cn:86/photos/MAC.png","integral":"0.0"},{"cny":"0","name":"AFC","cimg":"http://devapp.mcsports.cn:86/photos/AFC.png","integral":"0.0"}]
         */



        private String name;
        private String nickname;
        private String integral;
        private String totalintegral;
        private String totalcny;
        private String sex;
        private String height;
        private String weight;
        private Object token;
        private String img;
        private int imgStatus;
        private String birthday;
        private String mobile;
        private int passwordStatus;
        private int isRealNameAuth;
        private int qqStatus;
        private int weixinStatus;
        private int weiboStatus;
        private int pendingPaymentCount;
        private int shipmentPendingCount;
        private int receiveCount;
        private int completeCount;
        private String walletaddress;
        private String questionId;
        private List<WalletBean> wallet;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getIntegral() {
            return integral;
        }

        public void setIntegral(String integral) {
            this.integral = integral;
        }

        public String getTotalintegral() {
            return totalintegral;
        }

        public void setTotalintegral(String totalintegral) {
            this.totalintegral = totalintegral;
        }

        public String getTotalcny() {
            return totalcny;
        }

        public void setTotalcny(String totalcny) {
            this.totalcny = totalcny;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
            this.token = token;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getImgStatus() {
            return imgStatus;
        }

        public void setImgStatus(int imgStatus) {
            this.imgStatus = imgStatus;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getPasswordStatus() {
            return passwordStatus;
        }

        public void setPasswordStatus(int passwordStatus) {
            this.passwordStatus = passwordStatus;
        }

        public int getIsRealNameAuth() {
            return isRealNameAuth;
        }

        public void setIsRealNameAuth(int isRealNameAuth) {
            this.isRealNameAuth = isRealNameAuth;
        }

        public int getQqStatus() {
            return qqStatus;
        }

        public void setQqStatus(int qqStatus) {
            this.qqStatus = qqStatus;
        }

        public int getWeixinStatus() {
            return weixinStatus;
        }

        public void setWeixinStatus(int weixinStatus) {
            this.weixinStatus = weixinStatus;
        }

        public int getWeiboStatus() {
            return weiboStatus;
        }

        public void setWeiboStatus(int weiboStatus) {
            this.weiboStatus = weiboStatus;
        }

        public int getPendingPaymentCount() {
            return pendingPaymentCount;
        }

        public void setPendingPaymentCount(int pendingPaymentCount) {
            this.pendingPaymentCount = pendingPaymentCount;
        }

        public int getShipmentPendingCount() {
            return shipmentPendingCount;
        }

        public void setShipmentPendingCount(int shipmentPendingCount) {
            this.shipmentPendingCount = shipmentPendingCount;
        }

        public int getReceiveCount() {
            return receiveCount;
        }

        public void setReceiveCount(int receiveCount) {
            this.receiveCount = receiveCount;
        }

        public int getCompleteCount() {
            return completeCount;
        }

        public void setCompleteCount(int completeCount) {
            this.completeCount = completeCount;
        }

        public String getWalletaddress() {
            return walletaddress;
        }

        public void setWalletaddress(String walletaddress) {
            this.walletaddress = walletaddress;
        }

        public String getQuestionId() {
            return questionId;
        }

        public void setQuestionId(String questionId) {
            this.questionId = questionId;
        }

        public List<WalletBean> getWallet() {
            return wallet;
        }

        public void setWallet(List<WalletBean> wallet) {
            this.wallet = wallet;
        }

        public static class WalletBean {


            @Override
            public String toString() {
                return "WalletBean{" +
                        "cny='" + cny + '\'' +
                        ", name='" + name + '\'' +
                        ", cimg='" + cimg + '\'' +
                        ", integral='" + integral + '\'' +
                        '}';
            }

            /**
             * cny : 140184.9145050801
             * name : MCC
             * cimg : http://devapp.mcsports.cn:86/photos/MCC.png
             * integral : 177449.25886719
             */


            private String cny;
            private String name;
            private String cimg;
            private String integral;

            public String getCny() {
                return cny;
            }

            public void setCny(String cny) {
                this.cny = cny;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCimg() {
                return cimg;
            }

            public void setCimg(String cimg) {
                this.cimg = cimg;
            }

            public String getIntegral() {
                return integral;
            }

            public void setIntegral(String integral) {
                this.integral = integral;
            }
        }
    }



}
