# 🚦 Straffic — 스마트 교통 정보 플랫폼

> 서울시 대중교통 · 주차 정보를 한 곳에서 조회하고, **AI 기반 차량 번호판 인식 OCR** 기능과 **외부 API 연동**을 제공하는 웹 애플리케이션입니다.
>
> <br>

## 📌 프로젝트 개요

| 항목 | 내용 |
|------|------|
| 프로젝트명 | Straffic (Smart Traffic) |
| 개발 기간 | 2026.01 ~ 2026.01 (약 3주) |
| 개발 인원 | 6명 (팀 프로젝트) |
| 개발 유형 | Spring Boot 기반 풀스택 웹 애플리케이션 |

<br>

## 🛠 기술 스택

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
- **ODsay API** — 대중교통 길찾기
- - **TMap API** — 지도 및 경로 탐색
  - - **Kakao Maps API** — 지도 렌더링
    - - **서울시 열린데이터광장 API** — 지하철 실시간 정보
      - - **Google / Naver / Kakao OAuth2** — 소셜 로그인
        -
        - <br>

        ## ✨ 주요 기능

        ### 🗺 교통 정보
        - 지하철 · 버스 통합 길찾기 (ODsay, TMap 연동)
        - - 서울시 지하철 실시간 도착 정보 조회
          - - 카카오 지도 기반 주변 정류장 / 경로 시각화
            -
            - ### 🅿 주차 정보
            - - 주변 주차장 검색 및 실시간 잔여 면수 조회
              - - 주차 요금 및 운영 시간 안내
                -
                - ### 🚗 차량 번호판 인식 (AI · OCR)
                - - **YOLOv8** 기반 차량 번호판 영역 탐지
                  - - **EasyOCR**을 활용한 번호판 문자 인식
                    - - Python **Flask** OCR 서버 ↔ Spring Boot 간 **REST API 연동**
                      -   - Spring Boot → `POST /ocr` 요청 → Python Flask 서버에서 이미지 처리 → 번호판 텍스트 반환
                          - - 인식 결과를 DB에 저장하고 이력 조회 가능
                            - - 웹 UI에서 이미지 업로드 시 실시간 번호판 인식 결과 표시
                              -
                              - ### 👤 회원 / 보안
                              - - Spring Security 기반 폼 로그인
                                - - Google · Naver · Kakao OAuth2 소셜 로그인
                                  - - 마이페이지 (개인정보 수정, 활동 내역)
                                    -
                                    - ### 📋 커뮤니티
                                    - - 게시판 (공지사항, 자유게시판) CRUD
                                      - - 파일 첨부 업로드
                                        -
                                        - <br>

                                        ## 🏗 프로젝트 구조

                                        ```
                                        Straffic_MiniProject/
                                        ├── src/
                                        │   └── main/
                                        │       ├── java/com/example/straffic/
                                        │       │   ├── board/         # 게시판
                                        │       │   ├── config/        # Spring 설정 (Security, WebFlux 등)
                                        │       │   ├── dashboard/     # 교통 대시보드
                                        │       │   ├── member/        # 회원 관리
                                        │       │   ├── notice/        # 공지사항
                                        │       │   ├── oauth/         # 소셜 로그인
                                        │       │   ├── parking/       # 주차 정보
                                        │       │   └── security/      # 보안 설정
                                        │       └── resources/
                                        │           ├── templates/     # Thymeleaf 템플릿
                                        │           └── static/        # CSS, JS, 이미지
                                        ├── ocr-service/               # Python YOLOv8 + EasyOCR + Flask 서버
                                        └── build.gradle
                                        ```

                                        <br>
                                        
                                        ## ⚙️ 로컬 실행 방법

                                        ### 사전 요구사항
                                        - Java 17+
                                        - - Oracle Database XE
                                          - - Python 3.8+ (OCR 서비스 사용 시)
                                            -
                                            - ### 1. 저장소 클론
                                            - ```bash
                                              git clone https://github.com/violet-1205/Straffic_MiniProject.git
                                              cd Straffic_MiniProject
                                              ```

                                              ### 2. 시크릿 설정 파일 생성
                                              `src/main/resources/application-secret.properties` 파일을 직접 생성하고 아래 값을 입력합니다.

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

                                              ### 3. Spring Boot 실행
                                              ```bash
                                              ./gradlew bootRun
                                              ```

                                              ### 4. OCR 서비스 실행 (선택)
                                              ```bash
                                              cd ocr-service
                                              pip install -r requirements.txt
                                              python app.py
                                              ```

                                              ### 5. 접속
                                              ```
                                              http://localhost:1111
                                              ```

                                              <br>
                                              
                                              ## 👥 팀원 역할

                                              | 이름 | 담당 기능 |
                                              |------|-----------|
                                              | violet-1205 | 팀장, 차량 번호판 인식(YOLOv8), 전체 구조 설계 |
                                              | rhlfur2055-prog | 번호판 인식 EasyOCR 구현, 외부 API 연동 (ODsay, TMap, 서울시 열린데이터) |
                                              | goatwxy-ctrl | 주차 대시보드, 대시보드 UI |
                                              | dhkdrns2-crypto | 모바일 레이아웃, OCR SSL 연동 |
                                              | seonmin7117-lang | Spring Security, 소셜 로그인, CSS 테마 |
                                              | jae1205 / manyang | 게시판, 공지사항, CSS |

                                              <br>
                                              
                                              ## ⚠️ 보안 안내
                                              - `application-secret.properties` 파일은 `.gitignore`에 의해 버전 관리에서 제외됩니다.
                                              - - DB 접속 정보 및 API 키는 절대 커밋하지 마세요.
                                                -
                                                - ---
                                                - *Straffic_MiniProject · 6인 팀 프로젝트 · 2026.01*#  Straffic     

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

| 이름 | 담당 기능 |
|------|-----------|
| violet-1205 | 팀장, 차량 번호판 인식(YOLOv8), 공유 모빌리티, 전체 구조 설계 |
| goatwxy-ctrl | 주차 대시보드, 대시보드 UI |
| dhkdrns2-crypto | 모바일 레이아웃, OCR SSL 연동 |
| seonmin7117-lang | Spring Security, 소셜 로그인, CSS 테마 |
| jae1205 / manyang | 게시판, 공지사항, CSS |
| rhlfur2055 | api, ocr |
<br>
## ⚠️ 보안 안내
- `application-secret.properties` 파일은 `.gitignore`에 의해 버전 관리에서 제외됩니다.
- DB 접속 정보 및 API 키는 절대 커밋하지 마세요.
<br>
---
<p align="center">
  <sub>Straffic_MiniProject · 5인 팀 프로젝트 · 2026.01</sub>
</p>
