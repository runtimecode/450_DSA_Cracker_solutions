package Coursera.Week1.InterviewQuestions;

import Coursera.Week1.ClassNotes.UnionFind_basic;

import java.util.Date;

public class SocialNetworkConnectivity {
/*
    Given a social network containing nn members and a log file containing mm timestamps
    at which times pairs of members formed friendships, design an algorithm to determine
    the earliest time at which all members are connected (i.e., every member is a friend
    of a friend of a friend ... of a friend). Assume that the log file is sorted by timestamp
    and that friendship is an equivalence relation. The running time of your algorithm should
    be m \log nmlogn or better and use extra space proportional to nn.

 */

    private UnionFind_basic uf;
    private int numOfNotConnectedPeople;

    public SocialNetworkConnectivity(int N) {
        uf = new UnionFind_basic(N);
        numOfNotConnectedPeople = N;
    }

    public void addFriendship(int a, int b) {
        if (!uf.find(a, b)) {
            --numOfNotConnectedPeople;
        }
        System.out.printf("%tc\t%d has sent the friend request and now connected to %d%n",new Date(),a,b);
        uf.union(a,b);
    }

    public boolean isFullyConnected() {
        return this.numOfNotConnectedPeople == 1;
    }

}
