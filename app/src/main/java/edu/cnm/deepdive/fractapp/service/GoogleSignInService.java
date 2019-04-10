package edu.cnm.deepdive.fractapp.service;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import edu.cnm.deepdive.fractapp.FractApplication;
import edu.cnm.deepdive.fractapp.R;

/**
 * This class contains a google sign service that was implemented using an client Id web that was
 * retrieved using the google cloud service.
 *
 */
public class GoogleSignInService {


  private GoogleSignInClient client;
  private GoogleSignInAccount account;

  private GoogleSignInService() {
    GoogleSignInOptions options =
        new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestId()
            .requestIdToken(FractApplication.getInstance().getString(R.string.client_id))
            .build();
    client = GoogleSignIn.getClient(FractApplication.getInstance(), options);
  }

  public static GoogleSignInService getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public GoogleSignInClient getClient() {
    return client;
  }

  public void setClient(GoogleSignInClient client) {
    this.client = client;
  }

  public GoogleSignInAccount getAccount() {
    return account;
  }

  public void setAccount(GoogleSignInAccount account) {
    this.account = account;
  }

  private static class InstanceHolder {

    private static final GoogleSignInService INSTANCE = new GoogleSignInService();

  }

}


