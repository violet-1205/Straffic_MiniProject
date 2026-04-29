# Straffic

> 스마트 주차 관리 시스템, **AI OCR** 기반 **번호판 인식 및 API** 연동 플랫폼.

<br>

## 📋 프로젝트 개요

| 항목 | 내용 |
|------|-------|
| 프로젝트명 | Straffic (Smart Traffic) |
| 기간 | 2026.01 ~ 2026.01 (3주) |
| 팀 구성 | 6인 (협업 프로젝트) |
| 기술 스택 | Spring Boot |

<br>

## 🛠 기술 스택

### Backend
![Java](https://img.shields.io/badge/Java_17-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.1-6DB33F?style=flat-square&logo=springboot&logoColor=white) ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white) ![JPA](https://img.shields.io/badge/JPA_Hibernate-59666C?style=flat-square&logo=hibernate&logoColor=white)

### Frontend
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white) ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white)

### Database & Infra
![Oracle](https://img.shields.io/badge/Oracle_XE-F80000?style=flat-square&logo=oracle&logoColor=white) ![Python](https://img.shields.io/badge/Python_3-3776AB?style=flat-square&logo=python&logoColor=white) ![Flask](https://img.shields.io/badge/Flask-000000?style=flat-square&logo=flask&logoColor=white) ![EasyOCR](https://img.shields.io/badge/EasyOCR-FF6F00?style=flat-square&logo=python&logoColor=white) ![YOLOv8](https://img.shields.io/badge/YOLOv8-00FFFF?style=flat-square&logo=yolo&logoColor=black)

### External APIs
- **ODsay API** - 대중교통 길찾기
- **TMap API** - 지도 및 경로 탐색
- **Kakao Maps API** - 지도 렌더링
- **서울시 열린데이터광장 API** - 지하철 실시간 도착 정보
- **Google / Naver / Kakao OAuth2** - 소셜 로그인

<br>

## ✨ 주요 기능

### 🅿️ 주차 관리
- 실시간 주차 현황 대시보드 (ODsay, TMap 연동)
- 주차 구역 등록 및 관리
- 차량 입출차 이력 관리
- 주차 요금 자동 계산
- 모바일 반응형 UI

### 🚗 차량 번호판 인식 (AI OCR)
- **YOLOv8** 기반 차량 번호판 검출
- **EasyOCR** 기반 문자 인식
- Python **Flask** OCR 서버와 Spring Boot **REST API** 연동
- 인식 결과 DB 저장 및 UI 표시

### 🔐 회원 / 인증
- Spring Security 기반 인증 처리
- Google / Naver / Kakao OAuth2 소셜 로그인 지원
- 권한별 접근 제어 (관리자, 일반 사용자)

### 📢 게시판 / 공지사항
- 게시글(제목, 내용) CRUD
- 공지사항 관리 기능
- 댓글 기능

<br>

## 🔑 사용 API 목록

| API | 용도 | 발급처 |
|-----|------|--------|
| Google OAuth2 | 구글 소셜 로그인 | Google Cloud Console |
| Naver OAuth2 | 네이버 소셜 로그인 | Naver Developers |
| Kakao OAuth2 | 카카오 소셜 로그인 | Kakao Developers |
| Kakao Maps API | 지도 렌더링 및 마커 표시 | Kakao Developers |
| ODsay API | 대중교통 길찾기 경로 탐색 | ODsay Lab |
| TMap API | 지도 렌더링 및 경로 탐색 | SKT TMap Developers |
| 서울시 열린데이터광장 API | 지하철 실시간 도착 정보 | 서울 열린데이터광장 |

<br>

## 👥 팀원 역할

| 이름 | 담당 기능 |
|------|-----------|
| violet-1205 | 팀장, 구조 설계 |
| goatwxy-ctrl | 주차 대시보드, 대시보드 UI |
| dhkdrns2-crypto | 모바일 레이아웃, OCR SSL 연동, 게시판, 공지사항 |
| seonmin7117-lang | Spring Security, 소셜 로그인, CSS 테마 |
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
