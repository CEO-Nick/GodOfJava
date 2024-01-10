package Chapter13_Interface_Abstract_Enum;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType reference = new FinalReferenceType();
        reference.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
        dto.name = "익현";
        System.out.println(dto);
    }
}
