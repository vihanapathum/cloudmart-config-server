package com.cloudmart.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * CloudMart - Config Server.
 * Centralizes and externalizes NON-SECRET shared configuration for all
 * microservices (feature flags, common settings) using the "native" profile,
 * which serves files bundled under resources/config-repo/.
 * Sensitive values (DB passwords, connection strings) are intentionally kept
 * OUT of this server and are instead injected directly as environment
 * variables on each VM - see each service's README for details.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
