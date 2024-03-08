public class Main {
public static void main(String[] args) {
ThirdPartyAuthAPI thirdPartyAuthAPI = new ThirdPartyAuthAPI();
VoteAuthenticator adapter = new AuthAdapter(thirdPartyAuthAPI);
VotingApplication app = new VotingApplication(adapter);
app.submitVote("vote123");
}
}
