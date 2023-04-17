# member
스프링부트를 활용하여 회원 프로젝트 진행하기

https://www.youtube.com/watch?v=RhM1bQ76Tv0&list=PLV9zd3otBRt5ANIjawvd-el3QU594wyx7

위 링크 참고하여 진행중 (10번째 영상 진행해야함)

아래 링크 참고

https://www.youtube.com/watch?v=e6EkbZIVR-4&list=PLV9zd3otBRt5ANIjawvd-el3QU594wyx7&index=10


* RESTful한 것이 아니라 html화면 자체를 반환하는 방식으로 진행되고 있다.
* yml을 작성할 때에는 tab이 얼마나 들어가있는지 확인할 것
 -> jpa가 안 먹혀서 2시간을 헤맸는데 원인이 들여쓰기에 있었다. 바로 위에 작성했던 spring과 같은 단락에 있어 불통이 났었음
* @ModelAtrribute는 생략해도 괜찮으나, 지금은 공부중이니까 좀 더 명확하게 명시하기 위해 남겨두었다.
* entity를 그대로 가져오지 않는 이유는 엔티티 객체를 화면에 가져갔을 경우 데이터가 바뀔 때  db에도 영향을 미칠 수 있기 때문이다.
-----
### 커밋 컨벤션

https://velog.io/@outstandingboy/Git-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B7%9C%EC%95%BD-%EC%A0%95%EB%A6%AC-the-AngularJS-commit-conventions#-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80%EC%9D%98-%ED%98%95%EC%8B%9D

위 링크를 참고하되
* type scope : 짧은 요약

의 형식까지만 작성