package met.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Data
@NoArgsConstructor
@SessionScoped
public class Method implements Serializable{

    private Integer kTrudFun, kTrudEnt, kTrudClass, kTrudConn, kTrudNod, workTime;



    private double kTrud_k1, kTrud_k2, kTrud_k3, kTrud_k4, kTrud_k5, kTrud_k6, kTrud_k7, kTrud_k8, kTrud_k9,
            kTrud_k10, kTrud_k11, kTrud_k12, kTrud_k13, kTrud_k14, kTrud_k15, kTrud_k16, kTrud_k17, kTrud_k18;


    private double si_1, si_2, si_3, si_4, si_5, si_6;
    private double kp_1, kp_2, kp_3, kp_4, kp_5, kp_6;

    private int mm;             // трудоемкость

    int[][] hm = {{5,30},{10,80},{17,140},{26,210},{37,280},{50,340},{65,400},{80,450},{100,500},{120,550},
            {140,610},{160,670},{180,720},{200,770},{230,820},{260,870},{290,930},{330,990},{370,1040},{420,1090},
            {470,1150},{530,1200},{600,1250},{670,1300},{750,1350},{830,1400},{900,1450},{970,1500},{1150,1550},
            {1230,1600},{1310,1660},{1390,1720},{1470,1780},{1520,1840},{1570,1900},{1620,1960},{1680,2020}};

    private int rMin;           // минимальный срок разработки
    private int rMax;           // максимальный срок разработки
    private double rMed;        // среднее арифм срока разработки
    private Double cutLim;      // сокращение срока разрабтки
    private int newmm;          // новая трудоемкость
    private int yearMed;        // среднее количество лет реализации
    private int yearmm;         // трудоемкость по годам реализации
    private int costWork;       // Стоимость работ на разработку ППО ИС Сппо
    private int costTech;       // Стоимость техподдержки Стпо
    private Integer kUser;          // Количество пользователей системы
    private boolean kSysProm;   // Коэффициент состояния системы
    private boolean kSysAInf;   // Коэффициент типа инф. системы
    private int persons;        // Количество занятого персонала
    private int costOneYearSup; // Стоимость одного года поддержки
    private int costAccomp;     // Стоимость поддержки ППО за год

    // GET //
    // GET //
    // GET //

    ///////////////////////////////////////////////////////////////
    //Si

    public double getSi_1() {
        si_1 = (kTrudFun*32.12 + kTrudEnt*28.33 + kTrudClass*0 + kTrudConn*14.15 + kTrudNod*0) / workTime;
        return si_1;
    }

    public double getSi_2() {
        si_2 = (kTrudFun*58.03 + kTrudEnt*28.04 + kTrudClass*0 + kTrudConn*20.32 + kTrudNod*0) / workTime;
        return si_2;
    }

    public double getSi_3() {
        si_3 = (kTrudFun*45.42 + kTrudEnt*61.75 + kTrudClass*31.35 + kTrudConn*37.52 + kTrudNod*24.02) / workTime;
        return si_3;
    }

    public double getSi_4() {
        si_4 = (kTrudFun*31.57 + kTrudEnt*81.51 + kTrudClass*50.72 + kTrudConn*36.11 + kTrudNod*0) / workTime;
        return si_4;
    }

    public double getSi_5() {
        si_5 = (kTrudFun*88.96 + kTrudEnt*0 + kTrudClass*0 + kTrudConn*0 + kTrudNod*0) / workTime;
        return si_5;
    }

    public double getSi_6() {
        si_6 = (kTrudFun*8.69 + kTrudEnt*0 + kTrudClass*0 + kTrudConn*0 + kTrudNod*23.74) / workTime;
        return si_6;
    }


    /////////////////////////////////////////////////////////////////////////////
    // KP

    public double getKp_1() {
        kp_1 = kTrud_k11 * kTrud_k16 * kTrud_k17;
        return kp_1;
    }

    public double getKp_2() {
        kp_2 = kTrud_k1 * kTrud_k2 * kTrud_k4 * kTrud_k5 * kTrud_k6 * kTrud_k7 *
                kTrud_k8 * kTrud_k9 * kTrud_k16 * kTrud_k17 * kTrud_k18;
        return kp_2;
    }

    public double getKp_3() {
        kp_3 = kTrud_k1 * kTrud_k2 * kTrud_k4 * kTrud_k5 * kTrud_k6 * kTrud_k7 * kTrud_k8 * kTrud_k9 *
                kTrud_k11 * kTrud_k12 * kTrud_k13 * kTrud_k14 * kTrud_k15 * kTrud_k16 * kTrud_k17 * kTrud_k18;
        return kp_3;
    }

    public double getKp_4() {
        kp_4 = kTrud_k1 * kTrud_k2 * kTrud_k4 * kTrud_k5 * kTrud_k6 * kTrud_k7 * kTrud_k8 * kTrud_k9 *
                kTrud_k10 * kTrud_k12 * kTrud_k13 * kTrud_k14 * kTrud_k15 * kTrud_k16 * kTrud_k17 * kTrud_k18;
        return kp_4;
    }

    public double getKp_5() {
        kp_5 = kTrud_k1 * kTrud_k2 * kTrud_k4 * kTrud_k5 * kTrud_k6 * kTrud_k7 * kTrud_k8 * kTrud_k9 * kTrud_k10 *
                kTrud_k11 * kTrud_k12 * kTrud_k13 * kTrud_k14 * kTrud_k15 * kTrud_k16 * kTrud_k17 * kTrud_k18;
        return kp_5;
    }

    public double getKp_6() {
        kp_6 = kTrud_k1 * kTrud_k2 * kTrud_k11 * kTrud_k16 * kTrud_k18;
        return kp_6;
    }


    ///////////////////////////////////////////////////////////////////
    // mm

    public int getMm() {
        mm  = (int)Math.round(si_1*kp_1 + si_2*kp_2 + si_3*kp_3 + si_4*kp_4 + si_5*kp_5 + si_6*kp_6);
        return mm;
    }


    ///////////////////////////////////////////////////////////////////
    // rMin

    public int getrMin() {

        int min = 0;
        int mon = 2020;
        rMin = 0;

        if(mm == 0) {
            rMin = 0;
            return rMin;
        }

        if(mm > 2020) {
            min = 37;
            do{
                min = min + 1;
                mon = mon + 40;
            } while (mm >= mon);
        } else {
            for(int i=0; i<hm.length; i++) {
                if(mm <= hm[i][1]) {
                    min = i + 1;
                    rMin = min;
                    return rMin;
                }
            }
        }
        rMin = min;
        return rMin;
    }

    ///////////////////////////////////////////////////////////////////
    // rMax

    public int getrMax() {

        int max = 0;
        int mon = 1760;
        rMax = 0;

        if(mm == 0) {
            rMax = 0;
            return rMax;
        }

        if(mm > 1680) {
            max = 37;
            do{
                if(mm < mon) {
                    max = max - 1;
                }
                mon = mon + 40;
                max = max + 1;
            } while (mm >= mon);
        } else {
            for(int i=0; i<hm.length; i++) {
                if(mm == hm[i][0]) {
                    max = hm[i][0];
                    rMax = i;
                    return rMax;
                } else if (mm < hm[i][0]) {
//                    max = hm[i-1][0];
                    rMax = i;
                    return rMax;
                }
            }
        }

        rMax = max;
        return rMax;
    }

    ///////////////////////////////////////////////////////////////////
    // rMed

    public double getrMed() {
        rMed = rMax + rMin;
        rMed = rMed/2;
        if(rMin > rMed) {rMed = rMin;}
        return rMed;
    }


    ///////////////////////////////////////////////////////////////////
    // GET & SET //
    // kTrudFun ... kTrudNod

    public Integer getkTrudFun() {
        if(this.kTrudFun == null) {
            kTrudFun = 1;}
        return kTrudFun;
    }

    public void setkTrudFun(Integer kTrudFun) {
        this.kTrudFun = kTrudFun;
    }

    public Integer getkTrudEnt() {
        if(this.kTrudEnt == null) {
            kTrudEnt = 1;
        }
        return kTrudEnt;
    }

    public void setkTrudEnt(Integer kTrudEnt) {
        this.kTrudEnt = kTrudEnt;
    }

    public Integer getkTrudClass() {
        if(this.kTrudClass == null) {
            kTrudClass = 1;
        }
        return kTrudClass;
    }

    public void setkTrudClass(Integer kTrudClass) {
        this.kTrudClass = kTrudClass;
    }

    public Integer getkTrudConn() {
        if(this.kTrudConn == null) {
            kTrudConn = 1;
        }
        return kTrudConn;
    }

    public void setkTrudConn(Integer kTrudConn) {
        this.kTrudConn = kTrudConn;
    }

    public Integer getkTrudNod() {
        if(this.kTrudNod == null) {
            kTrudNod = 1;
        }
        return kTrudNod;
    }

    public void setkTrudNod(Integer kTrudNod) {
        this.kTrudNod = kTrudNod;
    }

    public Integer getWorkTime() {
        if(this.workTime == null) {
            workTime = 1;
        }
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }


    //////////////////////////////////////////////////////////////////////////////
    // kTrud_k


    public double getkTrud_k1() {
        return kTrud_k1;
    }

    public double getkTrud_k2() {
        return kTrud_k2;
    }

    public double getkTrud_k3() {
        return kTrud_k3;
    }

    public double getkTrud_k4() {
        return kTrud_k4;
    }

    public double getkTrud_k5() {
        return kTrud_k5;
    }

    public double getkTrud_k6() {
        return kTrud_k6;
    }

    public double getkTrud_k7() {
        return kTrud_k7;
    }

    public double getkTrud_k8() {
        return kTrud_k8;
    }

    public double getkTrud_k9() {
        return kTrud_k9;
    }

    public double getkTrud_k10() {
        return kTrud_k10;
    }

    public double getkTrud_k11() {
        return kTrud_k11;
    }

    public double getkTrud_k12() {
        return kTrud_k12;
    }

    public double getkTrud_k13() {
        return kTrud_k13;
    }

    public double getkTrud_k14() {
        return kTrud_k14;
    }

    public double getkTrud_k15() {
        return kTrud_k15;
    }

    public double getkTrud_k16() {
        return kTrud_k16;
    }

    public double getkTrud_k17() {
        return kTrud_k17;
    }

    public double getkTrud_k18() {
        return kTrud_k18;
    }

    //////////////////////////////////////////////////////////////////////////////
    // cutLim // сокращение срока разрабтки

    public Double getCutLim() {
        if(this.cutLim == null) {
            cutLim = rMed;
        }

        if(this.cutLim < rMin || this.cutLim > rMed) {
            cutLim = rMed;
        }
        return cutLim;
    }

    public void setCutLim() {
        this.cutLim = cutLim;
    }

    //////////////////////////////////////////////////////////////////////////////
    // newmm // новая трудоемкость

    public int getNewmm() {
        if(cutLim==0) {
            newmm = mm;
            return newmm;
        }
        newmm = (int)Math.round(mm + (rMed-cutLim)*100*0.75/rMed);
        return newmm;
    }


    //////////////////////////////////////////////////////////////////////////////
    // yearMed // среднее количество лет реализации

    public int getYearMed() {
        yearMed = (int)Math.floor(rMed/12 + 1);
        return yearMed;
    }

    //////////////////////////////////////////////////////////////////////////////
    // yearmm // трудоемкость по годам реализации

    public int getYearmm() {
        yearmm = (int)Math.round(newmm/yearMed);
        return yearmm;
    }


    //////////////////////////////////////////////////////////////////////////////
    // costWork // Стоимость работ на разработку ППО ИС Сппо


    public int getCostWork() {
        double tmp_cost = 0;
        double salAvg[] = new double[yearMed];
        double costAvg[] = new double[yearMed];

        double pay_2015 = 137.3;
        double pay_2016 = 103.4;
        double pay_2017 = 101.1;
        double pay_Med = (pay_2015 + pay_2016 + pay_2017)/(100*3);
        int pay_1 = 9252;

        salAvg[0] = Math.round(pay_1 * (1+pay_Med/100));

        if(yearMed > 1) {
            for (int i=1; i<yearMed; i++) {
                salAvg[i] = Math.round(salAvg[i-1] * (1+pay_Med/100));
            }
        }

        double psn = 0.28;          // единый взнос на гос соц страхование
        double pnr = 0.715;         // накладные расходы
        double prp = 0.48;          // расходы периода на управление и маркетинг
        double pr = 0.25;           // рентабельность

        costAvg[0] = Math.round(salAvg[0] * (1 + (0.9*psn + pnr + prp)/100) * (1 + pr/100));

        if(yearMed > 1) {
            for (int i=1; i<yearMed; i++) {
                costAvg[i] = Math.round(salAvg[i] * (1 + (0.9*psn + pnr + prp)/100) * (1 + pr/100));
            }
        }

        for(int i=0; i<costAvg.length; i++) {
            tmp_cost = tmp_cost + costAvg[i];
        }

        tmp_cost = tmp_cost*yearmm;
        costWork = (int) tmp_cost;
        return costWork;
    }

    //////////////////////////////////////////////////////////////////////////////
    // costTech // Стоимость техподдержки кодов Стпо в течение 1 года // имеется имперический коэффициент

    public int getCostTech() {

        double costAccess = 0.15;

        costTech = (int)Math.round(costWork * costAccess * kTrud_k2 * kTrud_k3 * kTrud_k16);

        return costTech;
    }


    //////////////////////////////////////////////////////////////////////////////
    // GET // SET для // sysProm, sysAInf, kUser

    public boolean iskSysProm() {
        return kSysProm;
    }

    public void setkSysProm(boolean kSysProm) {
        this.kSysProm = kSysProm;
    }

    public boolean iskSysAInf() {
        return kSysAInf;
    }

    public void setkSysAInf(boolean kSysAInf) {
        this.kSysAInf = kSysAInf;
    }

    public Integer getkUser() {
        if(this.kUser == null) {
            kUser = 1;
        }
        return kUser;
    }

    public void setkUser(Integer kUser) {
        this.kUser = kUser;
    }


    //////////////////////////////////////////////////////////////////////////////
    // persons  // Количество занятого персонала


    public int getPersons() {
        int tmp = 0;

        if(!kSysAInf) {
            if(kUser <= 50) {
                persons = 12;
            } else if (kUser <= 100) {
                persons = 24;
            } else if (kUser <= 200) {
                persons = 36;
            } else if (kUser <= 400) {
                persons = 48;
            } else {
                tmp = kUser - 400;
                persons = (kUser - 400)*12/100 + 48;
            }
        } else {
            if(kUser <= 50) {
                persons = 60;
            } else if (kUser <= 100) {
                persons = 120;
            } else if (kUser <= 200) {
                persons = 180;
            } else if (kUser <= 400) {
                persons = 240;
            } else {
                tmp = kUser - 400;
                persons = (kUser - 400)*60/100 + 240;
            }
        }

        return persons;
    }


    //////////////////////////////////////////////////////////////////////////////
    // costOneYearSup // Стоимость одного года поддержки эксплуатации ППО Сэкспл


    public int getCostOneYearSup() {
        int kPersPrep = 1;      // Норма занятого персонала в подготовке процесса поддержки эксплуатации, чел.мес
        int kPersExec = 6;      // Норма занятого персонала в проведении эксплуатационных испытаний, чел.мес

        double salAvg;
        double costAvg;
        double pay_2015 = 137.3;
        double pay_2016 = 103.4;
        double pay_2017 = 101.1;
        double pay_Med = (pay_2015 + pay_2016 + pay_2017)/(100*3);
        int pay_1 = 9252;

        salAvg = Math.round(pay_1 * (1+pay_Med/100));

        double psn = 0.28;          // единый взнос на гос соц страхование
        double pnr = 0.715;         // накладные расходы
        double prp = 0.48;          // расходы периода на управление и маркетинг
        double pr = 0.25;           // рентабельность

        costAvg = Math.round(salAvg * (1 + (0.9*psn + pnr + prp)/100) * (1 + pr/100));

        if(kSysProm) {
            costOneYearSup = (kPersPrep + kPersExec + persons)*(int)costAvg*12;
        } else {
            costOneYearSup = (kPersPrep + persons)*(int)costAvg*12;
        }

        return costOneYearSup;
    }


    //////////////////////////////////////////////////////////////////////////////
    // costAccomp // Стоимость одного года сопровождения

    public int getCostAccomp() {

        costAccomp = costOneYearSup + costTech;

        return costAccomp;
    }
}