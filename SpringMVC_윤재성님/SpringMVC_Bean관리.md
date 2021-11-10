## ReqeustScope

Request : 브라우저에 의해 요청이 들어오면 서버는 그걸 HttpServletRequest 객체에 담아둔다. 이 객체는 response가 전송될 때까지 유지된다.

redirect라면 HttpServletRequest가 이동하면서 삭제됐다가 재생성되나 forward로 보내면 객체가 그대로 살아있어서 사용 가능하다.

RequestScope : request가 response가 되어 전달될 때까지 Request 객체의 사용 범위

HttpServletRequest 객체에는 서버 개발자가 필요에 의해 데이터나 객체를 저장할 수 있고 RequestScope 내에서 사용이 가능함

- Model, ModelAndView, 객체 등을 이용해 값 전달

## RequestScope Bean 주입

**Bean 주입**

- @Autowired 를 활용해 Bean을 자동 주입 받을 수 있음
- 스프링 core에 prototype과 singleton이 있고 Spring MVC 에선 추가로 request, session, application을 제공함
- Java 방식은 @RequestScope 사용
- XML 방식은 bean을 정의할 때 scope="request"로 설정

## SessionScope

Session: 브라우저가 최초로 서버에 요청을 하면 브라우저 당 하나씩 메모리 공간을 서버에서 할당하는데 이 공간이 Session. 브라우저 종료 시점까지 서버에서 사용 가능.

SessionScope : 브라우저에서 요청이 올 때부터 브라우저 종료 시점까지를 SessionScope라고 함. session 영역에 저장된 데이터나 객체를 자유롭게 사용 가능.

@SessionAttribute : Session 영역에 저장된 객체를 사용하고자 할 때 메서드의 매개변수로 @SessionAttribute를 설정하면 Session 영역에 저장된 Bean 을 주입 받을 수 있다.

@SessionAttributes : @ModelAttribute로 주입 받는 Bean은 자동으로 Request 영역에 저장되는데 이걸 통해 주입 받는 Bean을 @SessionAttributes로 지정해 놓이면 request 영역이 아닌 session 영역에 저장되고 session 영역에서 주입받을 수 있다. 주의할 점은 반혼하는 메서드를 반드시 작성해야 함