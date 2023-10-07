import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Twitter {
    int tweetId;
    int userId;
    ArrayList<Integer> feed = new ArrayList<>();

    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        this.tweetId = tweetId;
        this.userId = userId;
        feed.add(tweetId);
    }

    public void getNewsFeed(int userId) {

    }

    public void follow(int followerId, int followeeId) {

    }

    public void unfollow(int followerId, int followeeId) {

    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */