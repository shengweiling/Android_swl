package test.swl.com.myapplication.modle;

import java.util.List;

/**
 * Created by caspar on 2017/9/21.
 */

public class FindHomepageBottomBean extends BaseBean {

    /**
     * response : {"count":2,"articleList":[{"articleDate":"09月13日","enjoyCount":3,"articlegCoverPic":"http://120.25.194.236:8081/photos/articleImage/1505274044745664.jpeg","articleCategoryName":"test1","commentCount":0,"articleId":30,"articleName":"test21"},{"articleDate":"09月13日","enjoyCount":0,"articlegCoverPic":"http://120.25.194.236:8081/photos/articleImage/1505274044745664.jpeg","articleCategoryName":"test1","commentCount":0,"articleId":29,"articleName":"test"}]}
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
                    "count=" + count +
                    ", articleList=" + articleList +
                    '}';
        }

        /**
         * count : 2
         * articleList : [{"articleDate":"09月13日","enjoyCount":3,"articlegCoverPic":"http://120.25.194.236:8081/photos/articleImage/1505274044745664.jpeg","articleCategoryName":"test1","commentCount":0,"articleId":30,"articleName":"test21"},{"articleDate":"09月13日","enjoyCount":0,"articlegCoverPic":"http://120.25.194.236:8081/photos/articleImage/1505274044745664.jpeg","articleCategoryName":"test1","commentCount":0,"articleId":29,"articleName":"test"}]
         */

        private int count;
        private List<ArticleListBean> articleList;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ArticleListBean> getArticleList() {
            return articleList;
        }

        public void setArticleList(List<ArticleListBean> articleList) {
            this.articleList = articleList;
        }

        public static class ArticleListBean {
            @Override
            public String toString() {
                return "ArticleListBean{" +
                        "articleDate='" + articleDate + '\'' +
                        ", enjoyCount=" + enjoyCount +
                        ", articlegCoverPic='" + articlegCoverPic + '\'' +
                        ", articleCategoryName='" + articleCategoryName + '\'' +
                        ", commentCount=" + commentCount +
                        ", articleId=" + articleId +
                        ", articleName='" + articleName + '\'' +
                        '}';
            }

            /**
             * articleDate : 09月13日
             * enjoyCount : 3
             * articlegCoverPic : http://120.25.194.236:8081/photos/articleImage/1505274044745664.jpeg
             * articleCategoryName : test1
             * commentCount : 0
             * articleId : 30
             * articleName : test21
             */

            private String articleDate;
            private int enjoyCount;
            private String articlegCoverPic;
            private String articleCategoryName;
            private int commentCount;
            private int articleId;
            private String articleName;

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
    }
}
