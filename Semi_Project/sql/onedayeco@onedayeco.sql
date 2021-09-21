select * from member; --사용자
select * from article; --게시글(공지사항/커뮤니티)
select * from a_confirm;--인증 게시판의 게시글
select * from a_search_team; --팀원 찾기 게시판의 게시글
select * from a_team; --우리팀 게시판의 게시글
select * from challenge; --챌린지에는 샘플 데이터가 들어있습니다!
select * from a_comment;
select * from confirm_comment;
select * from challenge;

select * from challenge_join cj left join challenge c on cj.challenge_id = c.challenge_id;

select a_id from article where a_id =SEQ_ARTICLE_ID.currval;
select SEQ_ARTICLE_ID.currval a_id from article where a_id=1;  
select row_number() over(order by a.a_id desc)rnum from article;
select num from article where a_id = SEQ_ARTICLE_ID.currval;   
select SEQ_ARTICLE_ID.currval num 
from (SEQ_ARTICLE_ID.nextval from dual)a;
rollback;

update a_confirm set challenge_id=1, confirm_type='기간' where a_id =4;
select count(*) cnt from article where a_type='공지사항';

commit;
select * from a_confirm where a_id= 22;

select * 
    from(
    select row_number() 
    over(order by a.a_id desc)rnum,a.*,at.attachment_id,at.original_filename,at.renamed_filename,at.attachment_status 
    from article a left join attachment at on a.a_id = at.a_id)a 
    
where rnum between 1 and 10;


select * from attachment;
insert into a_confirm(a_id,member_id,confirm_type,a_title,a_content,a_reg_date) values(SEQ_ARTICLE_ID.nextval,'aaaaa','하루','장바구니사용 인증','인증합니다',default);   
select SEQ_A_CONFIRM_ID.currval a_id from dual;
select SEQ_ARTICLE_ID.currval a_id from dual;
select * from confirm_comment;

select a_id from(select row_number() over(order by a.a_id desc)rnum,a_id from article a) where rnum =1;
select a_id from(select row_number() over(order by a.a_read_count desc)rnum,a_read_count,a_id from article a) where rnum =1;

select * from a_comment;
    from(
            select row_number() over(order by a.a_id desc)rnum,
                    a.*,
                at.attachment_id,
                at.original_filename,
                at.renamed_filename,
                at.attachment_status
            from article a
                left join attachment at
                    on a.a_id = at.a_id
        )a
where rnum between 1 and 10;
    
select count(*) cnt from article;

 insert into article(a_id,member_id,a_type,a_title,a_content,a_reg_date) 
 values(SEQ_ARTICLE_ID.nextval,'aaaaa','커뮤니티','안녕하세요 오늘은','날씨가 좋아서 걸어서 산책하는 길이에요.',default);
    
 insert into article(a_id,member_id,a_type,a_title,a_content,a_reg_date) 
 values(SEQ_ARTICLE_ID.nextval,?,?,?,?,?);   

select SEQ_ARTICLE_ID.currval a_id from dual;   
select seq_attachment_id.nextval at_id from dual;
select * from attachment;

insert into attachment (attachment_id,a_id, original_filename, renamed_filename) values(seq_attachment_id.nextval,45,'향수.png','123456789.png');

select * from article where a_id= 11;

select * from attachment where a_id = 11 and status ='Y';
select seq_a_comment_id.nextval from dual;
insert into a_comment(comment_id, member_id, a_id, comment_content, comment_reg_date, comment_level,comment_ref) 
        values(seq_a_comment_id.nextval,'aaaaa',46,'반갑습니다.',default,1,null);
        
nsert into a_comment(comment_id, member_id, a_id, comment_content, comment_reg_date, comment_level,comment_ref) 
        values(seq_a_comment_id.nextval,?,?,?,default,?,?);                
        
commit;

update article set a_title='안녕하세요', a_content='반갑습니다.' where a_id=46;
update article set a_title=?, a_content=? where a_id=?

select ac.* 
from a_comment ac where a_id = 23 start with comment_level = 1 connect by prior comment_id= comment_ref order siblings by ac.comment_reg_date desc;

select * from(select row_number() over(order by a.a_id desc)rnum,a.*,at.attachment_id,at.original_filename,at.renamed_filename,at.attachment_status from a_confirm a left join attachment at on a.a_id = at.a_id)a where rnum between 1 and 10;
select count(*) cnt from a_confirm;

select * from(select row_number() over(order by a.a_id desc)rnum,a.*,at.attachment_id,at.original_filename,at.renamed_filename,at.attachment_status from article a left join attachment at on a.a_id = at.a_id)a where rnum between 1 and 10;