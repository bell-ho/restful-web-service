# restful-web-service
2022-05-03

MappingJacksonValue,
SimpleBeanPropertyFilter,
FilterProvider,
@JsonFilter 
를 활용하여 Response 데이터를 Filtering 하였음

DTO와 병행하면서 쓰면 좋을거 같다

2022-05-08

JpaRepository : Entity의 기본적인 CRUD 인터페이스

객체간의 연관관계를 설정할때

부모에 @JsonManagedReference 자식에 @JsonBackReference를 설정하면 순환참조를 방지할 수 있음
