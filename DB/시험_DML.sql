use shoppingmall3;

# - 회원
# - 아이디 : 1, 이름 :홍길동, 포인트 :1000
# - 아이디 : 2, 이름 :김철수, 포인트 :500
insert into member(m_name,m_point)
	values('홍길동', 1000),('김철수', 500);
    
# - 상품
# - 상품 번호 :101, 상품명 : 노트북, 가격 :1500000, 재고 :10
# - 상품 번호 :102, 상품명 : 마우스, 가격 :30000, 재고 :50
insert into product(p_id, p_name, p_price, p_stock)
	values(101, '노트북', 1500000, 10),
		  (102, '마우스', 30000, 50);
select * from member;
select * from product;

# - 조건: 1번 회원이 101번 상품을 2개 주문함
# - product 테이블: 101번 상품 재고 2개 감소
# - member 테이블: 1번 회원 포인트 100점 증가
# - orders 테이블: 주문 내역 추가 (1번 회원, 101번 상품, 수량 2, 오늘 날짜)
# - 1번 회원이 주문한 상품명을 조회(JOIN 이용)
insert into orders(o_m_id, o_p_id, o_qty, o_date)
	values(1, 101,2,date(now())); 

update product
	set p_stock = p_stock -2
    where p_id = 101;
    
update member
	set m_point = m_point + 100
    where m_id = 1;
    
select * from orders
	join product on p_id = o_p_id
    where o_m_id = 1;
    
    
# 데이터베이스 보안과 관리
# 배송 업체에 데이터를 전달해야 하지만, 회원의 포인트 정보는 보안상 숨겨야 합니다.
# member 테이블에서 포인트 컬럼을 제외하고, m_id, m_name만 조회하는 보안용 가상 테이블 v_member_public을 생성하는 쿼리를 작성하세요.
create view v_member_public as
select m_id, m_name from member;


select * from v_member_public;
