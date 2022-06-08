package Coursera.Week1.InterviewQuestions;

public class TestClass {

    public static void main(String[] args) {
        int noOfFrdRequestSent = 0;
        SocialNetworkConnectivity snc = new SocialNetworkConnectivity(100);
        while(!snc.isFullyConnected()){
            snc.addFriendship((int) (Math.random() * 100),(int) (Math.random() * 100));
            noOfFrdRequestSent++;
        }
        System.out.println("finally every one is connected, total no of friend request sent : "+noOfFrdRequestSent);
    }
}
