package asia.wavelet.bigledger.data.test.jta;


public class Profiles {

	public static final String ACTIVE_PROFILE = "spring.profiles.active";
	public static final String DEFAULT_PROFILE = "spring.profiles.default";

	public static final String PRODUCTION = "production";
	public static final String DEVELOPMENT = "development";
	public static final String UNIT_TEST= "test";
	public static final String UNIT_TEST_LOG4JDBC = "test_log4jdbc";

	public static void setProfileAsSystemProperty(String profile) {
		System.setProperty(ACTIVE_PROFILE, profile);
	}
}
