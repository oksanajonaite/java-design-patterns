package proxy_reporting;

/**
 * Structural design pattern.
 * It provides middleman/tarpininka/placeholderi/surrogate for another object.
 * The proxy initially controls access to main object.
 *
 * Proxy adds ADDITIONAL functionality WITHOUT changing original object.
 * Additional functions can be: authentication, validation, logging..
 * Participants (dalyviai):
 * Subject (INTERFACE) Defines common behavior/interfce for Real and Proxy object.
 * Real/Main object -> object that does the main work.
 * Proxy -> controls access to real object, MAY add extra behavior.
 * Client -> person/system/device that uses the proxy INSTEAD of real object.
 *
 * Benefita/pliusai/advantages:
 * Controll access /security to sensitive functions.
 * Resouce optimisation -> Lazy loading / caching.
 * Extra funktions.
 *
 * Minusai
 * 1.Might create regression impact for EXISTING functionality.
 * 2.Might create performance impact for system.
 * 3.More complexity, more maintenance. more code.
 */
public class ProxyMain {

    public static void main(String[] args) {

       Report report1 = new RestrictedReport("Metines 2025 Algos.pdf", UserRole.REGULAR);
        Report report2 = new RestrictedReport("Metines 2025 Algos.pdf", UserRole.ADMIN);

        //test out regular user
        report1.displayReport();

        //test out admin user
        report2.displayReport();
    }
}
