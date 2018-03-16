package test.swl.com.myapplication.modle;

import java.util.List;

/**
 * Created by caspar on 2017/9/11.
 */

public class FindHomepageTopBean extends BaseBean{

    /**
     * response : {"recommendList":[{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":5,"articleName":"防攻击跟风"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":1,"articleName":"dcgf"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":2,"articleName":"edfvdg55"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":3,"articleName":"人格不"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":4,"articleName":"大使馆的"}],"recommendfirst":{"articleDate":"09月08日","enjoyCount":0,"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleCategoryName":"dfdg","commentCount":0,"articleId":7,"articleName":"容房东好地方"},"discoveryAdvert":[{"shopAdvertContent":"http://www.baidu.com","shopAdvertName":"光光","shopAdvertType":4,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503038953116958.jpg"},{"shopAdvertContent":"","shopAdvertName":"es","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503040534376934.jpeg"},{"shopAdvertContent":"","shopAdvertName":"ate","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503041097449759.jpg"},{"shopAdvertContent":"","shopAdvertName":"test","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503041130261652.jpg"}]}
     */

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {
        /**
         * recommendList : [{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":5,"articleName":"防攻击跟风"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":1,"articleName":"dcgf"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":2,"articleName":"edfvdg55"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":3,"articleName":"人格不"},{"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleId":4,"articleName":"大使馆的"}]
         * recommendfirst : {"articleDate":"09月08日","enjoyCount":0,"articlegCoverPic":"http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg","articleCategoryName":"dfdg","commentCount":0,"articleId":7,"articleName":"容房东好地方"}
         * discoveryAdvert : [{"shopAdvertContent":"http://www.baidu.com","shopAdvertName":"光光","shopAdvertType":4,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503038953116958.jpg"},{"shopAdvertContent":"","shopAdvertName":"es","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503040534376934.jpeg"},{"shopAdvertContent":"","shopAdvertName":"ate","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503041097449759.jpg"},{"shopAdvertContent":"","shopAdvertName":"test","shopAdvertType":7,"shopAdvertPic":"http://120.25.194.236:8081/photos/advertImage/1503041130261652.jpg"}]
         */

        private RecommendfirstBean recommendfirst;
        private List<RecommendListBean> recommendList;
        private List<DiscoveryAdvertBean> discoveryAdvert;

        public RecommendfirstBean getRecommendfirst() {
            return recommendfirst;
        }

        public void setRecommendfirst(RecommendfirstBean recommendfirst) {
            this.recommendfirst = recommendfirst;
        }

        public List<RecommendListBean> getRecommendList() {
            return recommendList;
        }

        public void setRecommendList(List<RecommendListBean> recommendList) {
            this.recommendList = recommendList;
        }

        public List<DiscoveryAdvertBean> getDiscoveryAdvert() {
            return discoveryAdvert;
        }

        public void setDiscoveryAdvert(List<DiscoveryAdvertBean> discoveryAdvert) {
            this.discoveryAdvert = discoveryAdvert;
        }

        public static class RecommendfirstBean {
            /**
             * articleDate : 09月08日
             * enjoyCount : 0
             * articlegCoverPic : http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg
             * articleCategoryName : dfdg
             * commentCount : 0
             * articleId : 7
             * articleName : 容房东好地方
             */

            private String articleDate;
            private int enjoyCount;
            private String articlegCoverPic;
            private String articleCategoryName;
            private int commentCount;
            private int articleId;
            private String articleName;
            private int articleCategoryId;

            public void setArticleCategoryId(int articleCategoryId) {
                this.articleCategoryId = articleCategoryId;
            }

            public int getArticleCategoryId() {
                return articleCategoryId;
            }

            public String getArticleDate() {
                return articleDate;
            }

            public void setArticleDate(String articleDate) {
                this.articleDate = articleDate;
            }

            public int getEnjoyCount() {
                return enjoyCount;
            }

            public void setEnjoyCount(int enjoyCount) {
                this.enjoyCount = enjoyCount;
            }

            public String getArticlegCoverPic() {
                return articlegCoverPic;
            }

            public void setArticlegCoverPic(String articlegCoverPic) {
                this.articlegCoverPic = articlegCoverPic;
            }

            public String getArticleCategoryName() {
                return articleCategoryName;
            }

            public void setArticleCategoryName(String articleCategoryName) {
                this.articleCategoryName = articleCategoryName;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getArticleId() {
                return articleId;
            }

            public void setArticleId(int articleId) {
                this.articleId = articleId;
            }

            public String getArticleName() {
                return articleName;
            }

            public void setArticleName(String articleName) {
                this.articleName = articleName;
            }
        }

        public static class RecommendListBean {
            @Override
            public String toString() {
                return "RecommendListBean{" +
                        "articlegCoverPic='" + articlegCoverPic + '\'' +
                        ", articleId=" + articleId +
                        ", articleName='" + articleName + '\'' +
                        '}';
            }

            /**
             * articlegCoverPic : http://120.25.194.236:8081/photos/advertImage/1499334151389894.jpg
             * articleId : 5
             * articleName : 防攻击跟风
             */

            private String articlegCoverPic;
            private int articleId;
            private String articleName;

            public String getArticlegCoverPic() {
                return articlegCoverPic;
            }

            public void setArticlegCoverPic(String articlegCoverPic) {
                this.articlegCoverPic = articlegCoverPic;
            }

            public int getArticleId() {
                return articleId;
            }

            public void setArticleId(int articleId) {
                this.articleId = articleId;
            }

            public String getArticleName() {
                return articleName;
            }

            public void setArticleName(String articleName) {
                this.articleName = articleName;
            }
        }

        public static class DiscoveryAdvertBean {
            /**
             * shopAdvertContent : http://www.baidu.com
             * shopAdvertName : 光光
             * shopAdvertType : 4
             * shopAdvertPic : http://120.25.194.236:8081/photos/advertImage/1503038953116958.jpg
             */

            private String shopAdvertContent;
            private String shopAdvertName;
            private int shopAdvertType;
            private String shopAdvertPic;

            public String getShopAdvertContent() {
                return shopAdvertContent;
            }

            public void setShopAdvertContent(String shopAdvertContent) {
                this.shopAdvertContent = shopAdvertContent;
            }

            public String getShopAdvertName() {
                return shopAdvertName;
            }

            public void setShopAdvertName(String shopAdvertName) {
                this.shopAdvertName = shopAdvertName;
            }

            public int getShopAdvertType() {
                return shopAdvertType;
            }

            public void setShopAdvertType(int shopAdvertType) {
                this.shopAdvertType = shopAdvertType;
            }

            public String getShopAdvertPic() {
                return shopAdvertPic;
            }

            public void setShopAdvertPic(String shopAdvertPic) {
                this.shopAdvertPic = shopAdvertPic;
            }
        }
    }
}
