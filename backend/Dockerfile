# ─────────────────────────────────────────────
#  Stage 1 – Build
# ─────────────────────────────────────────────
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom.xml from the current directory (backend/)
COPY pom.xml .
RUN mvn dependency:go-offline -q

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests -q

# ─────────────────────────────────────────────
#  Stage 2 – Run
# ─────────────────────────────────────────────
FROM eclipse-temurin:17-jre-alpine

LABEL maintainer="Sourabh Awate"
LABEL description="Sourabh Awate – Professional Portfolio Backend"

WORKDIR /app

# Non-root user for security
RUN addgroup -S portfolio && adduser -S portfolio -G portfolio
USER portfolio

# Copy the built jar (matching the name in your pom.xml)
COPY --from=builder /app/target/*.jar portfolio.jar

# Expose port
EXPOSE 8074

# JVM tuning for containers
ENTRYPOINT ["java", \
    "-XX:+UseContainerSupport", \
    "-XX:MaxRAMPercentage=75.0", \
    "-Djava.security.egd=file:/dev/./urandom", \
    "-jar", "portfolio.jar"]