package com.example.user.coinpass;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by TheTundeDoherty on 10/24/2017.
 */

public interface RequestInterface {
    @GET("data/pricemulti?fsyms=ETH%2CBTC&tsyms=USD%2CEUR%2CNGN%2CRUB%2CCAD%2CJPY%2CGBP%2CAUD%2CINR%2CHKD%2CIDR%2CSGD%2CCHF%2CCNY%2CZAR%2CTHB%2CSAR%2CKRW%2CGHS%2CBRL")
    Call<JSONResponse> getJSON();
}
