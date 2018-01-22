package com.kodilla.testing.forum.statistics;


public class ForumStatisticsCalculator {

    private int usersCount;
    private int posts;
    private int comments;
    private static double averagePostsCountPerUser;
    private static double averageCommentsCountPerUser;
    private static double averageCommentsCountPerPost;

    Statistics statistics;

    public ForumStatisticsCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        usersCount = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        averagePostsCountPerUser = usersCount > 0  ? (double) posts / usersCount : 0;
        averageCommentsCountPerUser = usersCount > 0 ? (double) comments / usersCount : 0;
        averageCommentsCountPerPost = posts > 0 ? (double) comments / posts : 0;

    }

    public double getAveragePostsCountPerUser() {
        return averagePostsCountPerUser;
    }

    public double getAverageCommentsCountPerUser() {
        return averageCommentsCountPerUser;
    }

    public double getAverageCommentsCountPerPost() {
        return averageCommentsCountPerPost;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public String showStatistics(){
        return getAverageCommentsCountPerPost() + " " + getAverageCommentsCountPerUser() + " " + getAveragePostsCountPerUser();
    }

}
