package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUser;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUser = statistics.usersNames().size();
        if(numberOfUser>0) {
            numberOfPosts = statistics.postsCount();
            if(numberOfPosts>0) {
                averagePostsPerUser = numberOfPosts/numberOfUser;
                numberOfComments = statistics.commentsCount();
                if(numberOfComments>0) {
                    averageCommentsPerUser = numberOfComments/numberOfUser;
                    averageCommentsPerPosts = numberOfComments/numberOfPosts;
                }
            }else {
                numberOfComments=0;
            }
        }else {
            numberOfPosts =0;
            numberOfComments =0;
        }

    }

    @Override
    public String toString() {
        return "Forum Statistics:" +
                "\n Number of user = " + numberOfUser +
                "\n Number of posts = " + numberOfPosts +
                "\n Number of comments = " + numberOfComments +
                "\n Average posts per user = " + averagePostsPerUser +
                "\n Average comments per user = " + averageCommentsPerUser +
                "\n Average comments per posts = " + averageCommentsPerPosts;
     }
        public String showStatistics(){
            String abc = new ForumStatistics().toString();
            return abc;
        }
    }

