# Aily-AIRecycle(Automatic recycling separation device using AI)

# Project Description
Aily-AIRecycle 프로젝트는 Aily 시스템의 백엔드 구성 요소에 중점을 둡니다.    
Restful API를 활용하여 Kiost, Front 및 Data Server 간의 통신을 원활하게 처리합니다.    
이 백엔드 인프라는 AI 기술을 활용한 자동 재활용 분리장치의 통합 및 작동을 원활하게 지원합니다.    

## 사용된 기술
# 기술 선택 이유

## 1. Docker
- **이유**: Docker는 애플리케이션을 컨테이너로 패키징하고 배포하는 데 탁월한 도구입니다.    
  편리한 배포와 확장성을 위해 Docker를 선택했습니다. 컨테이너는 환경에 관계없이 일관된 실행을 보장하므로, 팀 간 협업 및 배포 프로세스를 간편하게 관리할 수 있습니다.    

## 2. Kubernetes
- **이유**: Kubernetes는 컨테이너 오케스트레이션 플랫폼으로, 여러 서버에서 애플리케이션을 효율적으로 관리하고 배포할 수 있습니다.
  라즈베리 파이 4를 클러스터링하여 자원을 효율적으로 활용하고 확장성을 갖추기 위해 Kubernetes를 도입했습니다.    
  이는 애플리케이션의 확장과 유지보수를 단순화하며 안정적인 운영을 지원합니다.    

## 3. Nginx Ingress Controller
- **이유**: Nginx Ingress Controller는 웹 트래픽을 관리하고 분산하는 데 탁월한 역할을 합니다.    
  서버에 적은 수의 동시 접속이 예상되거나 서버에 부하가 걸릴 경우, Nginx Ingress Controller를 도입하여 트래픽을 효율적으로 분산하고 부하를 분산시킵니다.    
  또한 SSL 종료, 로드 밸런싱, 경로 기반 라우팅과 같은 기능을 통해 웹 서버의 효율성을 향상시키기 위해 선택했습니다.    

## 4. NFS (Network File System)
- **이유**: NFS는 여러 서버 간에 파일을 공유하고 액세스할 수 있도록 해주는 분산 파일 시스템입니다.    
  서버 다운 시 데이터 손실을 방지하고 데이터를 백업하기 위해 NFS를 도입했습니다. 이는 중요한 데이터를 안정적으로 보관하고 서버 장애 시에도 데이터에 안전하게 접근할 수 있도록 합니다.    
  또한, 데이터의 중앙 저장소로 활용하여 효과적인 데이터 관리를 가능케 합니다.

  
4. SHA-256
5. Email 인증
6. MSA

# Project Installation and Execution Instructions

# Project Usage Guidelines
