//plugins {
//    id("org.jetbrains.kotlin.jvm")
//}

dependencies {
    api("org.clever:clever-spring")
    api("org.clever:clever-core")
    api("org.clever:clever-data-jdbc")
    api("org.clever:clever-data-redis")
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly("mysql:mysql-connector-java")
    runtimeOnly("com.oracle.database.jdbc:ojdbc8")
}
