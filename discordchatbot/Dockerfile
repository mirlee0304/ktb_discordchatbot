# Java 21 런타임 환경
FROM eclipse-temurin:21-jdk-jammy

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일 복사
ARG JAR_FILE=build/libs/discordchatbot-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 포트 노출 (필요한 경우)
EXPOSE 8080

# 환경변수 전달
ENV DB_USER=${DB_USER}
ENV DB_PASSWORD=${DB_PASSWORD}

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
