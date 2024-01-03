package Chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        
    }

    public void makeMemberObject() {
        MemberDto dto1 = new MemberDto();
        MemberDto dto2 = new MemberDto("IkHyeon");
        MemberDto dto3 = new MemberDto("IkHyeon", "01063965887");
        MemberDto dto4 = new MemberDto("IkHyeon", "01063965887", "andantej99@naver.com");
    }
}
