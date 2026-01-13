package SerializableDeserialization;

//transient : Sometimes you do NOT want certain fields to be saved
// such as:passwords,OTP,temporary/calculated values,cache data.
// Mark those variables as transient.

import java.io.Serializable;

class User implements Serializable {

    int id;
    String Username;
    transient String password;

}

public class Transient {

}

