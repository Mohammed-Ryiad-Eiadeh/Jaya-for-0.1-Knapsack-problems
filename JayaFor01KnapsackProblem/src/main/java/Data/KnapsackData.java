package Data;

/**
 * this class contains all datasets that were used in the experiments and other methods to retrieve datasets components
 * */

public class KnapsackData {

    private double[] Profits;
    private double[] Weights;
    private double TotalWeight;
    private double OptimalProfits;

    /**
     * this is a constructor used to load the user choose knapsack problem
     * @param Id refers to the knapsack problem id
     */
    public KnapsackData(int Id) {
            switch (Id) {
                case -1 -> {
                    // Detest P01
                    Profits = new double[]{92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
                    Weights = new double[]{23, 31, 29, 44, 53, 38, 63, 85, 89, 82};
                    TotalWeight = 165;
                    OptimalProfits = 309;
                    // optimal solution here is Total Profits is 309 and solution is [1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0]
                }
                case -2 -> {
                    // Detest P02
                    Profits = new double[]{24, 13, 23, 15, 16};
                    Weights = new double[]{12, 7, 11, 8, 9};
                    TotalWeight = 26;
                    OptimalProfits = 51;
                    // optimal solution here is Total Profits is 51 and solution is [0.0, 1.0, 1.0, 1.0, 0.0]
                }
                case -3 -> {
                    // Detest P03
                    Profits = new double[]{50, 50, 64, 46, 50, 5};
                    Weights = new double[]{56, 59, 80, 64, 75, 17};
                    TotalWeight = 190;
                    OptimalProfits = 150;
                    // optimal solution here is Total Profits is 150 and solution is [1.0, 1.0, 0.0, 0.0, 1.0, 0.0]
                }
                case -5 -> {
                    // Detest P05
                    Profits = new double[]{350, 400, 450, 20, 70, 8, 5, 5};
                    Weights = new double[]{25, 35, 45, 5, 25, 3, 2, 2};
                    TotalWeight = 104;
                    OptimalProfits = 900;
                    // optimal solution here is Total Profits is 900 and solution is [1, 0, 1, 1, 1, 0, 1, 1]
                }
                case -6 -> {
                    // Detest P06
                    Profits = new double[]{442, 525, 511, 593, 546, 564, 617};
                    Weights = new double[]{41, 50, 49, 59, 55, 57, 60};
                    TotalWeight = 170;
                    OptimalProfits = 1735;
                    // optimal solution here is Total Profits is 1735 and solution is [0, 1, 0, 1, 0, 0, 1]
                }
                case -7 -> {
                    // Detest P07
                    Profits = new double[]{135, 139, 149, 150, 156, 163, 173, 184, 192, 201, 210, 214, 221, 229, 240};
                    Weights = new double[]{70, 73, 77, 80, 82, 87, 90, 94, 98, 106, 110, 113, 115, 118, 120};
                    TotalWeight = 750;
                    OptimalProfits = 1458;
                    // optimal solution here is Total Profits is 1458 and solution is [1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1]
                }
                case -8 -> {
                    // Detest P08
                    Profits = new double[]{825594, 1677009, 1676628, 1523970, 943972, 97426, 69666, 1296457, 1679693, 1902996, 1844992, 1049289, 1252836, 1319836, 953277, 2067538, 675367, 853655, 1826027, 65731, 901489, 577243, 466257, 369261};
                    Weights = new double[]{382745, 799601, 909247, 729069, 467902, 44328, 34610, 698150, 823460, 903959, 853665, 551830, 610856, 670702, 488960, 951111, 323046, 446298, 931161, 31385, 496951, 264724, 224916, 169684};
                    TotalWeight = 6404180;
                    OptimalProfits = 1.3549094E7;
                    // optimal solution here is Total Profits is 1.3549094E7 and solution is [1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1]
                }

                case 1 -> {
                    // Detest kp_1
                    Profits = new double[]{55, 10, 47, 5, 4, 50, 8, 61, 85, 87};
                    Weights = new double[]{95, 4, 60, 32, 23, 72, 80, 62, 65, 46};
                    TotalWeight = 269;
                    OptimalProfits = 295;
                    // optimal solution here is Total Profits is 295 and solution is [0, 1, 1, 1, 0, 0, 0, 1, 1, 1]
                }
                case 2 -> {
                    // Detest kp_2
                    Profits = new double[]{44, 46, 90, 72, 91, 40, 75, 35, 8, 54, 78, 40, 77, 15, 61, 17, 75, 29, 75, 63};
                    Weights = new double[]{92, 4, 43, 83, 84, 68, 92, 82, 6, 44, 32, 18, 56, 83, 25, 96, 70, 48, 14, 58};
                    TotalWeight = 878;
                    OptimalProfits = 1024;
                    // optimal solution here is Total Profits is 1024 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0]
                }
                case 3 -> {
                    // Detest kp_3
                    Profits = new double[]{9, 11, 13, 15};
                    Weights = new double[]{6, 5, 9, 7};
                    TotalWeight = 20;
                    OptimalProfits = 35;
                    // optimal solution here is Total Profits is 35 and solution is [1.0, 1.0, 0.0, 1.0]
                }
                case 4 -> {
                    // Detest kp_4
                    Profits = new double[]{6, 10, 12, 13};
                    Weights = new double[]{2, 4, 6, 7};
                    TotalWeight = 11;
                    OptimalProfits = 23;
                    // optimal solution here is Total Profits is 23 and solution is [0.0, 1.0, 0.0, 1.0]
                }
                case 5 -> {
                    // Detest kp_5
                    Profits = new double[]{0.125126, 19.330424, 58.500931, 35.029145, 82.284005,17.410810, 71.050142, 30.399487, 9.140294, 14.731285, 98.852504, 11.908322, 0.891140, 53.166295, 60.176397};
                    Weights = new double[]{56.358531, 80.874050, 47.987304, 89.596240, 74.660482, 85.894345, 51.353496, 1.498459, 36.445204, 16.589862, 44.569231, 0.466933, 37.788018, 57.118442, 60.716575};
                    TotalWeight = 375;
                    OptimalProfits = 481.069368;
                    // optimal solution here is Total Profits is 481.069368 and solution is [0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0]
                }
                case 6 -> {
                    // Detest kp_6
                    Profits = new double[]{20, 18, 17, 15, 15, 10, 5, 3, 1, 1};
                    Weights = new double[]{30, 25, 20, 18, 17, 11, 5, 2, 1, 1};
                    TotalWeight = 60;
                    OptimalProfits = 52;
                    // optimal solution here is Total Profits is 52 and solution is [0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0]
                }
                case -4, 7 -> {
                    // Detest kp_7
                    Profits = new double[]{70, 20, 39,37, 7, 5, 10};
                    Weights = new double[]{31, 10, 20, 19, 4, 3, 6};
                    TotalWeight = 50;
                    OptimalProfits = 107;
                    // optimal solution here is Total Profits is 107 and solution is [1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0]
                }
                case 8 -> {
                    // Detest kp_8
                    Profits = new double[]{981, 980, 979, 978, 977, 976, 487, 974, 970, 485, 485, 970, 970, 484, 484, 976, 974, 482, 962, 961, 959, 958, 857};
                    Weights = new double[]{983, 982, 981, 980, 979, 978, 488, 976, 972, 486, 486, 972, 972, 485, 485, 969, 966, 483, 964, 963, 961, 958, 959};
                    TotalWeight = 10000;
                    OptimalProfits =  9767;
                    // optimal solution here is Total Profits is 9767 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
                }
                case 9 -> {
                    // Detest kp_9
                    Profits = new double[]{33, 24, 36, 37, 12};
                    Weights = new double[]{15, 20, 17, 8, 31};
                    TotalWeight = 80;
                    OptimalProfits = 130;
                    // optimal solution here is Total Profits is 130 and solution is [1.0, 1.0, 1.0, 1.0, 0.0]
                }
                case 10 -> {
                    // Detest kp_10
                    Profits = new double[]{91, 72, 90, 46, 55, 8, 35, 75, 61, 15, 77, 40, 63, 75, 29, 75, 17, 78, 40, 44};
                    Weights = new double[]{84, 83, 43, 4, 44, 6, 82, 92, 25, 83, 56, 18, 58, 14, 48, 70, 96, 32, 68, 92};
                    TotalWeight = 879;
                    OptimalProfits = 1025;
                    // optimal solution here is Total Profits is 1025 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0]
                }
                case 11 -> {
                    // Detest kp_11
                    Profits = new double[]{57, 64, 50, 6, 52, 6, 85, 60, 70, 65, 63, 96, 18, 48, 85, 50, 77, 18, 70, 92, 17, 43, 5, 23, 67, 88, 35, 3, 91, 48};
                    Weights = new double[]{46, 17, 35, 1, 26, 17, 17, 48, 38, 17, 32, 21, 29, 48, 31, 8, 42, 37, 6, 9, 15, 22, 27, 14, 42, 40, 14, 31, 6, 34};
                    TotalWeight = 577;
                    OptimalProfits = 1437;
                    // optimal solution here is Total Profits is 1437 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0]
                }
                case 12 -> {
                    // Detest kp_12
                    Profits = new double[]{35, 67, 30, 69, 40, 40, 21, 73, 82, 93, 52, 20, 61, 20, 42, 86, 43, 93, 38, 70, 59, 11, 42, 93, 6, 39, 25, 23, 36, 93, 51, 81, 36, 46, 96};
                    Weights = new double[]{7, 4, 36, 47, 6, 33, 8, 35, 32, 3, 40, 50, 22, 18, 3, 12, 30, 31, 13, 33, 4, 48, 5, 17, 33, 26, 27, 19, 39, 15, 33, 47, 17, 41, 40};
                    TotalWeight = 655;
                    OptimalProfits =  1689;
                    // optimal solution here is Total Profits is  1689 and solution is [1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]
                }
                case 13 -> {
                    // Detest kp_13
                    Profits = new double[]{13, 16, 42, 69, 66, 68, 1, 13, 77, 85, 75, 95, 92, 23, 51, 79, 53, 62, 56, 74, 7, 50, 23, 34, 56, 75, 42, 51, 13, 22, 30, 45, 25, 27, 90, 59, 94, 62, 26, 11};
                    Weights = new double[]{28, 23, 35, 38, 20, 29, 11, 48, 26, 14, 12, 48, 35, 36, 33, 39, 30, 26, 44, 20, 13, 15, 46, 36, 43, 19, 32, 2, 47, 24, 26, 39, 17, 32, 17, 16, 33, 22, 6, 12};
                    TotalWeight = 819;
                    OptimalProfits = 1821;
                    // optimal solution here is Total Profits is 1821 and solution is [0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0]
                }
                case 14 -> {
                    // Detest kp_14
                    Profits = new double[]{98, 70, 66, 33, 2, 58, 4, 27, 20, 45, 77, 63, 32, 30, 8, 18, 73, 9, 92, 43, 8, 58, 84, 35, 78, 71, 60, 38, 40, 43, 43, 22, 50, 4, 57, 5, 88, 87, 34, 98, 96, 99, 16, 1, 25};
                    Weights = new double[]{18, 12, 38, 12, 23, 13, 18, 46, 1, 7, 20, 43, 11, 47, 49, 19, 50, 7, 39, 29, 32, 25, 12, 8, 32, 41, 34, 24, 48, 30, 12, 35, 17, 38, 50, 14, 47, 35, 5, 13, 47, 24, 45, 39, 1};
                    TotalWeight = 907;
                    OptimalProfits = 2033;
                    // optimal solution here is Total Profits is 2033 and solution is [1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0]
                }
                case 15 -> {
                    // Detest kp_15
                    Profits = new double[]{78, 69, 87, 59, 63, 12, 22, 4, 45, 33, 29, 50, 19, 94, 95, 60, 1, 91, 69, 8, 100, 32, 81, 47, 59, 48, 56, 18, 59, 16, 45, 54, 47, 84, 100, 98, 75, 20, 4, 19, 58, 63, 37, 64, 90, 26, 29, 13, 53, 83};
                    Weights = new double[]{15, 40, 22, 28, 50, 35, 49, 5, 45, 3, 7, 32, 19, 16, 40, 16, 31, 24, 15, 42, 29, 4, 14, 9, 29, 11, 25, 37, 48, 39, 5, 47, 49, 31, 48, 17, 46, 1, 25, 8, 16, 9, 30, 33, 18, 3, 3, 3, 4, 1};
                    TotalWeight = 882;
                    OptimalProfits = 2440;
                    // optimal solution here is Total Profits is 2440 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]
                }
                case 16 -> {
                    // Detest kp_16
                    Profits = new double[]{98, 74, 76, 4, 12, 27, 90, 98, 100, 35, 30, 19, 75, 72, 19, 44, 5, 66, 79, 87, 79, 44, 35, 6, 82, 11, 1, 28, 95, 68, 39, 86, 68, 61, 44, 97, 83, 2, 15, 49, 59, 30, 44, 40, 14, 96, 37, 84, 5, 43, 8, 32, 95, 86, 18};
                    Weights = new double[]{27, 15, 46, 5, 40, 9, 36, 12, 11, 11, 49, 20, 32, 3, 12, 44, 24, 1, 24, 42, 44, 16, 12, 42, 22, 26, 10, 8, 46, 50, 20, 42, 48, 45, 43, 35, 9, 12, 22, 2, 14, 50, 16, 29, 31, 46, 20, 35, 11, 4, 32, 35, 15, 29, 16};
                    TotalWeight = 1050;
                    OptimalProfits = 2651;
                    // optimal solution here is Total Profits is 2651 and solution is [1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0]
                }
                case 17 -> {
                    // Detest kp_17
                    Profits = new double[]{81, 37, 70, 64, 97, 21, 60, 9, 55, 85, 5, 33, 71, 87, 51, 100, 43, 27, 48, 17, 16, 27, 76, 61, 97, 78, 58, 46, 29, 76, 10, 11, 74, 36, 59, 30, 72, 37, 72, 100, 9, 47, 10, 73, 92, 9, 52, 56, 69, 30, 61, 20, 66, 70, 46, 16, 43, 60, 33, 84};
                    Weights = new double[]{7, 13, 47, 33, 38, 41, 3, 21, 37, 7, 32, 13, 42, 42, 23, 20, 49, 1, 20, 25, 31, 4, 8, 33, 11, 6, 3, 9, 26, 44, 39, 7, 4,34, 25, 25, 16, 17, 46, 23, 38, 10, 5, 11, 28, 34, 47, 3, 9, 22, 17, 5, 41, 20, 33, 29, 1, 33, 16, 14};
                    TotalWeight = 1006;
                    OptimalProfits = 2917;
                    // optimal solution here is Total Profits is 2917 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0]
                }
                case 18 -> {
                    // Detest kp_18
                    Profits = new double[]{47, 63, 81, 57, 3, 80, 28, 83, 69, 61, 39, 7, 100, 67, 23, 10, 25, 91, 22, 48, 91, 20, 45, 62, 60, 67, 27, 43, 80, 94, 47, 31, 44, 31, 28, 14, 17, 50, 9, 93, 15, 17, 72, 68, 36, 10, 1, 38, 79, 45, 10, 81, 66, 46, 54, 53, 63, 65, 20, 81, 20, 42,24, 28, 1};
                    Weights = new double[]{47, 27, 24, 27, 17, 17, 50, 24, 38, 34, 40, 14, 15, 36, 10, 42, 9, 48, 37, 7, 43, 47, 29, 20, 23, 36, 14, 2, 48, 50, 39, 50, 25, 7, 24, 38, 34, 44, 38, 31, 14, 17, 42, 20, 5, 44, 22, 9, 1, 33, 19, 19, 23, 26, 16, 24, 1, 9, 16, 38, 30, 36, 41, 43, 6};
                    TotalWeight = 1319;
                    OptimalProfits = 2817;
                    // optimal solution here is Total Profits is 2817 and solution is [1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0]
                }
                case 19 -> {
                    // Detest kp_19
                    Profits = new double[]{66, 76, 71, 61, 4, 20, 34, 65, 22, 8, 99, 21, 99, 62, 25, 52, 72, 26, 12, 55, 22, 32, 98, 31, 95, 42, 2, 32, 16, 100, 46, 55, 27, 89, 11, 83, 43, 93, 53, 88, 36, 41, 60, 92, 14, 5, 41, 60, 92, 30, 55, 79, 33, 10, 45, 3, 68, 12, 20, 54, 63, 38, 61, 85, 71, 40, 58, 25, 73, 35};
                    Weights = new double[]{4, 16, 16, 2, 9, 44, 33, 43, 14, 45, 11, 49, 21, 12, 41, 19, 26, 38, 42, 20, 5, 14, 40, 47, 29, 47, 30, 50, 39, 10, 26, 33, 44, 31, 50, 7, 15, 24, 7, 12, 10, 34, 17, 40, 28, 12, 35, 3, 29, 50, 19, 28, 47, 13, 42, 9, 44, 14, 43, 41, 10, 49, 13, 39, 41, 25, 46, 6, 7, 43};
                    TotalWeight = 1426;
                    OptimalProfits = 3223;
                    // optimal solution here is Total Profits is 3223 and solution is [1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]
                }
                case 20 -> {
                    // Detest kp_20
                    Profits = new double[]{2, 73, 82, 12, 49, 35, 78, 29, 83, 18, 87, 93, 20, 6, 55, 1, 83, 91, 71, 25, 59, 94, 90, 61, 80, 84, 57, 1, 26, 44, 44, 88, 7, 34, 18, 25, 73, 29, 24, 14, 23, 82, 38, 67, 94, 43, 61, 97, 37, 67, 32, 89, 30, 30, 91, 50, 21, 3, 18, 31, 97, 79, 68, 85, 43, 71, 49, 83, 44, 86, 1, 100, 28, 4, 16};
                    Weights = new double[]{24, 45, 15, 40, 9, 37, 13, 5, 43, 35, 48, 50, 27, 46, 24, 45, 2, 7, 38, 20, 20, 31, 2, 20, 3, 35, 27, 4, 21, 22, 33, 11,5, 24, 37, 31, 46, 13, 12, 12, 41, 36, 44, 36, 34, 22, 29, 50, 48, 17, 8, 21, 28, 2, 44, 45, 25, 11, 37, 35, 24, 9, 40, 45, 8, 47, 1, 22, 1, 12, 36, 35, 14, 17, 5};
                    TotalWeight = 1433;
                    OptimalProfits = 3614;
                    // optimal solution here is Total Profits is 3614 and solution is [0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0]
                }
                case 21 -> {
                    // Detest kp_21
                    Profits = new double[]{25424, 604597, 1272766, 1174735, 1707707, 313906, 1689410, 860062};
                    Weights = new double[]{12630, 284975, 583838, 575342, 780934, 164152, 912739, 412657};
                    TotalWeight = 1863633;
                    OptimalProfits = 3924400;
                    // optimal solution here is Total Profits is 3924400 and solution is [1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0]
                }
                case 22 -> {
                    // Detest kp_22
                    Profits = new double[]{1452321, 747077, 209067, 674618, 1076193, 1619423, 1212262, 538078};
                    Weights = new double[]{666885, 346111, 97003, 337746, 507338, 836649, 564424, 289280};
                    TotalWeight =  1809614;
                    OptimalProfits = 3813669;
                    // optimal solution here is Total Profits is 3813669 and solution is [1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0]
                }
                case 23 -> {
                    // Detest kp_23
                    Profits = new double[]{1155261, 73653, 1631996, 1130519, 1045697, 1061672, 193508, 296438};
                    Weights = new double[]{580593, 34916, 848308, 528023, 497440, 490277, 97943, 141338};
                    TotalWeight = 1609419;
                    OptimalProfits = 3347452;
                    // optimal solution here is Total Profits is 3,347,452 and solution is [1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0]
                }
                case 24 -> {
                    // Detest kp_24
                    Profits = new double[]{1521886, 919285, 794937, 1296002, 354090, 1582223, 409313, 1401234};
                    Weights = new double[]{800588, 496540, 364175, 699421, 179078, 778021, 206205, 700556};
                    TotalWeight = 2112292;
                    OptimalProfits = 4187707;
                    // optimal solution here is Total Profits is 4187707 and solution is [0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0]
                }
                case 25 -> {
                    // Detest kp_25
                    Profits = new double[]{1582289, 640086, 1270769, 1839736, 795116, 1099087, 1524697, 951036};
                    Weights = new double[]{862754, 318418, 651921, 844733, 438185, 591527, 810761, 468202};
                    TotalWeight = 2493250;
                    OptimalProfits = 4955555;
                    // optimal solution here is Total Profits is 4955555 and solution is [0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0]
                }
                case 26 -> {
                    // Detest kp_26
                    Profits = new double[]{1370413, 1281034, 124356, 1296241, 1410881, 993625, 1209949, 573180, 147263, 617431, 1193525, 861742};
                    Weights = new double[]{672437, 664905, 66143, 670473, 649045, 513812, 638975, 262871, 79332, 334123, 620541, 437769};
                    TotalWeight = 2805213;
                    OptimalProfits = 5688887;
                    // optimal solution here is Total Profits is 5688887 and solution is [1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0]
                }
                case 27 -> {
                    // Detest kp_27
                    Profits = new double[]{800734, 843137, 551965, 1921987, 1429742, 1272555, 552649, 1468914, 645615, 1859603, 89001, 1190478};
                    Weights = new double[]{419614, 463634, 305284, 918709, 743181, 652957, 256487, 790046, 310107, 985008, 43471, 629575};
                    TotalWeight = 3259036;
                    OptimalProfits = 6498597;
                    // optimal solution here is Total Profits is 6498597 and solution is [0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0]
                }
                case 28 -> {
                    // Detest kp_28
                    Profits = new double[]{744436, 446887, 550596, 191341, 142738, 1571133, 868558, 54288, 1425628, 1318834, 2127868, 422621};
                    Weights = new double[]{399907, 241106, 271976, 105019, 65202, 864369, 458263, 27528, 667143, 681262, 982460, 215395};
                    TotalWeight = 2489815;
                    OptimalProfits = 5170626;
                    // optimal solution here is Total Profits is 5170626 and solution is [0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0]
                }
                case 29 -> {
                    // Detest kp_29
                    Profits = new double[]{2157066, 853212, 1845571, 1068849, 962615, 1278897, 1026191, 1377079, 264669, 299959, 1080762, 1263347};
                    Weights = new double[]{992884, 417147, 996822, 591627, 482278, 651305, 491683, 727443, 135904, 152947, 590330, 677035};
                    TotalWeight = 3453702;
                    OptimalProfits =  6992404;
                    // optimal solution here is Total Profits is 6992404 and solution is [1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0]
                }
                case 30 -> {
                    // Detest kp_30
                    Profits = new double[]{390564, 1896554, 518776, 534038, 539357, 281514, 679085, 164965, 603431, 1601666, 1826086, 1235821};
                    Weights = new double[]{187536, 919812, 281447, 290967, 293933, 146982, 335995, 76949, 296586, 732368, 912094, 566115};
                    TotalWeight = 2520392;
                    OptimalProfits = 5337472;
                    // optimal solution here is Total Profits is 5337472 and solution is [0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0]
                }
            }
    }

    /**
     * this method is used to get the profit of each item in a certain knapsack problem
     * @return the profits of items in an array data structure
     */
    public double[] GetProfits() {
        return Profits;
    }

    /**
     * this method is used to get the weight of each item in a certain knapsack problem
     * @return the weight of items in an array data structure
     */
    public double[] GetWeights() {
        return Weights;
    }

    /**
     * this method is used to get the total weight of a certain knapsack problem
     * @return the total weight
     */
    public double GetTotalWeight() {
        return TotalWeight;
    }

    /**
     * this method is used to get the total profits of a certain knapsack problem
     * @return the total profits
     */
    public double GetOptimalProfits() {
        return OptimalProfits;
    }
}
