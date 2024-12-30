package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam); // 파라미터 두개 이상이면 파람 넣어야함

    List<Item> findAll(ItemSearchCond itemSearch);

    Optional<Item> findById(Long id);


}

/* 마이바티스 매핑 XML을 호출해주는 매퍼 인터페이스
  이 인터페이스에는 @Mapper 애노테이션을 붙여주어야 MyBatis에서 인식할 수 있다.
  이 인터페이스의 메서드를 호출하면 xml파일의 해당 SQL을 실행하고 결과를 돌려준다.
  해당 인터페이스의 구현체는 나중에 설명
 */
