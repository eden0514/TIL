1. 우정사업본부 홈페이지(https://www.epost.go.kr/search/zipcode/cmzcd002k01.jsp)에서 주소 DB 다운 받기
2. 지역별 주소 DB 다운을 받으면 지역별 txt 파일 받을 수 있음
3. mysql 환경 설정하기 ```set global local_infile=true;```
4. mysql --local_infile -u root -p 옵션 사용하여 mysql 실행
5. 주소 들어갈 테이블 생성
```
CREATE TABLE IF NOT EXISTS `ZIPCODE` (
`ZIP_NO` VARCHAR(5) NULL COMMENT '우편번호',
`SIDO` VARCHAR(20) NULL COMMENT '시도',
`SIDO_ENG` VARCHAR(40) NULL COMMENT '시도(영문)',
`SIGUNGU` VARCHAR(20) NULL COMMENT '시군구',
`SIGUNGU_ENG` VARCHAR(40) NULL COMMENT '시군구(영문)',
`EUPMYUN` VARCHAR(20) NULL COMMENT '읍면',
`EUPMYUN_ENG` VARCHAR(40) NULL COMMENT '읍면(영문)',
`DORO_CD` VARCHAR(12) NULL COMMENT '도로명코드',
`DORO` VARCHAR(80) NULL COMMENT '도로명',
`DORO_ENG` VARCHAR(80) NULL COMMENT '도로명(영문)',
`UNDERGROUND_YN` CHAR(1) NULL COMMENT '지하여부',
`BUILD_NO1` DECIMAL(5,0) NULL COMMENT '건물번호본번',
`BUILD_NO2` DECIMAL(5,0) NULL COMMENT '건물번호부번',
`BUILD_NO_MANAGE_NO` VARCHAR(25) NULL COMMENT '건물관리번호',
`DARYANG_NM` VARCHAR(40) NULL COMMENT '다량배달처명',
`BUILD_NM` VARCHAR(200) NULL COMMENT '시군구용건물명',
`DONG_CD` VARCHAR(10) NULL COMMENT '법정동코드',
`DONG_NM` VARCHAR(20) NULL COMMENT '법정동명',
`RI` VARCHAR(20) NULL COMMENT '리명',
`H_DONG_NM` VARCHAR(40) NULL COMMENT '행정동명',
`SAN_YN` VARCHAR(1) NULL COMMENT '산여부',
`ZIBUN1` DECIMAL(4,0) NULL COMMENT '지번본번',
`EUPMYUN_DONG_SN` VARCHAR(2) NULL COMMENT '읍면동일련번호',
`ZIBUN2` DECIMAL(4,0) NULL COMMENT '지번부번' ,
`ZIP_NO_OLD` VARCHAR(4) NULL COMMENT '구우편번호' ,
`ZIP_SN` VARCHAR(2) NULL COMMENT '우편일련번호'
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
```
6. 아까 다운받은 txt 파일들을 테이블에 넣어준다.(총 17개)
```
LOAD DATA LOCAL INFILE "/path/to/zipcode_DB/txt.file" INTO TABLE ZIPCODE CHARACTER SET 'utf8' FIELDS TERMINATED BY '|' IGNORE 1 LINES;
```
