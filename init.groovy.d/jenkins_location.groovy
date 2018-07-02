import hudson.model.*;
import jenkins.model.*;
import static groovy.json.JsonOutput.*


// Variables
def env = System.getenv()

println prettyPrint(toJson(env))

// def rootURL = env['ROOT_URL']
// def adminAddress = env['ADMIN_ADDRESS']

// // Thread.start {
//     println "--> Configuring Jenkins location Settings"

//     if (rootURL) {
//         println "--> Setting base URL"
//         def jlc = JenkinsLocationConfiguration.get()
//         jlc.setUrl(rootURL)
//         jlc.save()
//     }

//     if (adminAddress) {
//         println "--> Setting email address for Jenkins admin"
//         def jlc = JenkinsLocationConfiguration.get()
//         jlc.setAdminAddress(env['ADMIN_ADDRESS'])
//         jlc.save()
//     }
// // }
