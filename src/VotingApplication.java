// Client code - uses the adapter
public class VotingApplication {
private VoteAuthenticator authenticator;
public VotingApplication(VoteAuthenticator authenticator) {
    this.authenticator = authenticator;
}

public void submitVote(String voteId) {
    if (authenticator.authenticateVote(voteId)) {
        System.out.println("Vote authenticated and submitted successfully.");
    } else {
        System.out.println("Failed to authenticate vote.");
    }
}
}
