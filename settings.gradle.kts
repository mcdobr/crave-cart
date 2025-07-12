plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "crave-cart"
include(":services:order")
include(":services:cart")
include(":services:catalog")
include(":clients:webapp")
include("services:delivery-tracking")
findProject(":services:delivery-tracking")?.name = "delivery-tracking"
