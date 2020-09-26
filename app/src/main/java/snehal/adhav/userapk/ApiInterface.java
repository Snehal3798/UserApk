package snehal.adhav.userapk;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Kamere on 9/1/2018.
 */

public interface ApiInterface{

    @POST("register.php")
    @FormUrlEncoded
    Call<Model> register(@Field("user_name") String username, @Field("user_email") String email, @Field("password") String password);

    @POST("login.php")
    @FormUrlEncoded
    Call<Model> login(@Field("user_name") String username, @Field("password") String password);



}

