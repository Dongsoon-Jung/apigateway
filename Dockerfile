FROM 160365781997.dkr.ecr.ap-northeast-2.amazonaws.com/candipay/apigateway:latest

COPY ./apigateway-0.0.1-SNAPSHOT.jar .
EXPOSE 8008

ENTRYPOINT ["java", "-jar", "apigateway-0.0.1-SNAPSHOT.jar"]

