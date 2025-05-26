//public class MiniProject03 {
//
//    // 선택 정렬 메서드
//    public static void classSort(int[] n) {
//        int num = n.length;
//
//        for (int i = 0; i < num - 1; i++) {
//            int minIndex = i;
//
//            for (int j = i + 1; j < num; j++) {
//                if (n[j] < n[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            int temp = n[minIndex];
//            n[minIndex] = n[i];
//            n[i] = temp;
//
//            System.out.println("Sorted Data " + (i + 1) + "단계:");
//            printArray(n);
//        }
//
//        // ⭐ 정렬 후: 가장 큰 수를 끝에서 두 번째로 이동시키기
//        moveMaxToSecondLast(n);
//    }
//
//    // 배열 출력 메서드
//    public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    // ⭐ 최대값을 끝에서 두 번째로 옮기는 메서드
//    public static void moveMaxToSecondLast(int[] arr) {
//        int maxIndex = 0;
//        int n = arr.length;
//
//        // 최대값의 인덱스 찾기
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//
//        // 최대값이 마지막에 있으면 끝에서 두 번째로 이동
//        if (maxIndex == n - 1) {
//            int temp = arr[n - 1];
//            arr[n - 1] = arr[n - 2];
//            arr[n - 2] = temp;
//        }
//
//        // ✅ 결과 출력
//        System.out.println("\n최대값을 끝에서 두 번째로 이동한 결과:");
//        printArray(arr);
//    }
//
//    // main 메서드
//    public static void main(String[] args) {
//        int[] InputData = {69, 10, 30, 2, 16, 8, 31, 22};
//
//        System.out.println("Input Data:");
//        printArray(InputData);
//        System.out.println();
//
//        classSort(InputData);
//    }
//}