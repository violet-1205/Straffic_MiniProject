#  Straffic     

>        , **AI     OCR**  ** API **   .

<br>

##   

|  |  |
|------|------|
|  | Straffic (Smart Traffic) |
|   | 2026.01 ~ 2026.01 ( 3) |
|   | 6 ( ) |
|   | Spring Boot     |

<br>

##   

### Backend
![Java](https://img.shields.io/badge/Java_17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.1-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white)
![JPA](https://img.shields.io/badge/JPA_Hibernate-59666C?style=flat-square&logo=hibernate&logoColor=white)

### Frontend
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white)

### Database & Infra
![Oracle](https://img.shields.io/badge/Oracle_XE-F80000?style=flat-square&logo=oracle&logoColor=white)
![Python](https://img.shields.io/badge/Python_3-3776AB?style=flat-square&logo=python&logoColor=white)
![Flask](https://img.shields.io/badge/Flask-000000?style=flat-square&logo=flask&logoColor=white)
![EasyOCR](https://img.shields.io/badge/EasyOCR-FF6F00?style=flat-square&logo=python&logoColor=white)
![YOLOv8](https://img.shields.io/badge/YOLOv8-00FFFF?style=flat-square&logo=yolo&logoColor=black)

### External APIs
- **ODsay API**   
- - **TMap API**     
- - **Kakao Maps API**   
- - **  API**    
- - **Google / Naver / Kakao OAuth2**   

<br>

##   

###   
-      (ODsay, TMap )
-      -      
-      -      /  

###   



###     (AI  OCR)
- **YOLOv8**     
- - **EasyOCR**    
- - Python **Flask** OCR   Spring Boot  **REST API **
-   - Spring Boot  `POST /ocr`   Python Flask       
-   -   DB    
-   -  UI        

###   / 
- Spring Security   
- - Google  Naver  Kakao OAuth2  
- -  ( ,  )

###  
-  (, ) CRUD
-  -   

<br>

##   

```
Straffic_MiniProject/
 src/
     main/
             java/com/example/straffic/
                        board/         # 
                                   config/        # Spring  (Security, WebFlux )
                                              dashboard/     #  
                                                         member/        #  
                                                                    notice/        # 
                                                                               oauth/         #  
                                                                                          parking/       #  
                                                                                                     security/      #  
                                                                                                             resources/
                                                                                                                         templates/     # Thymeleaf 
                                                                                                                                     static/        # CSS, JS, 
                                                                                                                                      ocr-service/               # Python YOLOv8 + EasyOCR + Flask 
                                                                                                                                       build.gradle
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       <br>
                                                                                                                                       
                                                                                                                                       ##    
                                                                                                                                       
                                                                                                                                       ###  
                                                                                                                                       - Java 17+
                                                                                                                                       - Oracle Database XE
                                                                                                                                       - Python 3.8+ (OCR   )
                                                                                                                                       
                                                                                                                                       ### 1.  
                                                                                                                                       ```bash
                                                                                                                                       git clone https://github.com/violet-1205/Straffic_MiniProject.git
                                                                                                                                       cd Straffic_MiniProject
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       ### 2.    
                                                                                                                                       `src/main/resources/application-secret.properties`      .
                                                                                                                                       
                                                                                                                                       ```properties
                                                                                                                                       # Database
                                                                                                                                       spring.datasource.username=YOUR_DB_USER
                                                                                                                                       spring.datasource.password=YOUR_DB_PASSWORD
                                                                                                                                       
                                                                                                                                       # API Keys
                                                                                                                                       api.odsay.key=YOUR_ODSAY_KEY
                                                                                                                                       api.tmap.key=YOUR_TMAP_KEY
                                                                                                                                       api.kakao.key=YOUR_KAKAO_REST_KEY
                                                                                                                                       api.kakao.js-key=YOUR_KAKAO_JS_KEY
                                                                                                                                       kakao.js.key=YOUR_KAKAO_JS_KEY
                                                                                                                                       api.seoul.key=YOUR_SEOUL_API_KEY
                                                                                                                                       
                                                                                                                                       # OAuth2
                                                                                                                                       spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_ID
                                                                                                                                       spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_SECRET
                                                                                                                                       spring.security.oauth2.client.registration.naver.client-id=YOUR_NAVER_ID
                                                                                                                                       spring.security.oauth2.client.registration.naver.client-secret=YOUR_NAVER_SECRET
                                                                                                                                       spring.security.oauth2.client.registration.kakao.client-id=YOUR_KAKAO_ID
                                                                                                                                       spring.security.oauth2.client.registration.kakao.client-secret=YOUR_KAKAO_SECRET
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       ### 3. Spring Boot 
                                                                                                                                       ```bash
                                                                                                                                       ./gradlew bootRun
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       ### 4. OCR   ()
                                                                                                                                       ```bash
                                                                                                                                       cd ocr-service
                                                                                                                                       pip install -r requirements.txt
                                                                                                                                       python app.py
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       ### 5. 
                                                                                                                                       ```
                                                                                                                                       http://localhost:1111
                                                                                                                                       ```
                                                                                                                                       
                                                                                                                                       <br>
                                                                                                                                       
                                                                                                                                       ##   
                                                                                                                                       
                                                                                                                                       |  |   |
                                                                                                                                       |------|-----------|
                                                                                                                                       | violet-1205 | ,   (YOLOv8),    |
                                                                                                                                       | rhlfur2055-prog |   EasyOCR ,  API  (ODsay, TMap,  ) |
                                                                                                                                       | goatwxy-ctrl |  ,  UI |
                                                                                                                                       | dhkdrns2-crypto |  , OCR SSL  |
                                                                                                                                       | seonmin7117-lang | Spring Security,  , CSS  |
                                                                                                                                       | jae1205 / manyang | , , CSS |
                                                                                                                                       
                                                                                                                                       <br>
                                                                                                                                       
                                                                                                                                       ##   
                                                                                                                                       - `application-secret.properties`  `.gitignore`    .
                                                                                                                                       - DB    API    .
                                                                                                                                       
                                                                                                                                       ---
                                                                                                                                       *Straffic_MiniProject  6    2026.01*