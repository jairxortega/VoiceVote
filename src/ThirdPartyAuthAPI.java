// Target interface expected by the application
interface VoteAuthenticator {
    boolean authenticateVote(String voteId);
}

// Adaptee class - the third-party authentication API
public class ThirdPartyAuthAPI {
    public boolean verifyVote(String voteId) {
        // Logic to verify the vote
        return true; // Assuming the vote is verified successfully
    }
}
