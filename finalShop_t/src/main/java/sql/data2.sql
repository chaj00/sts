select * from TB_PRODUCT;
delete tb_product 
where CATEGORY_NO = 'CAT000000004';

INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('jang1', '�嵿��', 'USR', 'jang1', '�ʵ��б���?', '�����ʵ��б�', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '����� ���ʱ� ���ʵ� ���ʾ���Ʈ 101�� 1001ȣ', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('kim', '�輭��', 'USR', 'kim', '�ʵ��б���?', '�����ʵ��б�', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '����� ���ʱ� ���ʵ� ���ʾ���Ʈ 101�� 1001ȣ', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('lee', '�̹�ȣ', 'USR', 'lee', '�ʵ��б���?', '�����ʵ��б�', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '����� ���ʱ� ���ʵ� ���ʾ���Ʈ 101�� 1001ȣ', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ;
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('kang', '������', 'USR', 'kang', '�ʵ��б���?', '�����ʵ��б�', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '����� ���ʱ� ���ʵ� ���ʾ���Ʈ 101�� 1001ȣ', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 

create sequence ord_seq;

alter table tb_order
modify(ord_no varchar2(20))

alter table tb_order_product
modify(ord_no varchar2(20))

desc tb_order
select to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval from dual;


insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'kim',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000001',1);
			
commit;

select * from TB_ORDER;
select * from TB_ORDER_PRODUCT;


insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'kim',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000002',1);
			insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'lee',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000002',1);
insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'kim',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000002',1);

			
insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'lee',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000003',1);
insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'kim',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000003',1);
insert into TB_ORDER
values (to_char(sysdate,'yyyymmdd') ||100000||ord_seq.nextval,
        'jang1',50000,'�輭��','010','����','001','test','N',sysdate);
insert into TB_ORDER_PRODUCT 
values(to_char(sysdate,'yyyymmdd') ||100000||ord_seq.currval,
			'PRD000000003',1);			












select * from TB_MEM












