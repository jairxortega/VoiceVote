// Adapter class
public class AuthAdapter implements VoteAuthenticator {
    private ThirdPartyAuthAPI thirdPartyAuthAPI;

    public AuthAdapter(ThirdPartyAuthAPI thirdPartyAuthAPI) {
        this.thirdPartyAuthAPI = thirdPartyAuthAPI;
    }

    @Override
    public boolean authenticateVote(String voteId) {
        // Translate the call into the third-party API's verifyVote method
        return thirdPartyAuthAPI.verifyVote(voteId);
    }
}
