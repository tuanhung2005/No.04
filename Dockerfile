# Sử dụng image chính thức của Java làm base
FROM eclipse-temurin:17-jdk-alpine

# Tạo thư mục ứng dụng trong container
WORKDIR /app

# Copy file JAR vào container (giả sử file JAR đã build sẵn)
COPY target/No01-1.0-SNAPSHOT.jar app.jar

# Expose port nếu cần (ví dụ Spring Boot mặc định chạy ở 8080)
EXPOSE 8080

# Lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
