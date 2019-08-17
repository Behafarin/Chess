package chessproject.Models;

import chess.FXMLDocumentController;
import java.util.ArrayList;

public class Player {

    public static boolean  isChecked = false;
    public Piece ChosenPiece = null;
    String name;
    public Player(String name) {
        this.name = name;
    }
    public static boolean Mate(Player p){
        int kingindex=0;
        for (int i = 1; i < 65; i++) {
            if(FXMLDocumentController.houses[i].piece!=null)
            {
                if ((FXMLDocumentController.houses[i]
                        .piece.index == 5) && (FXMLDocumentController
                        .houses[i].piece
                        .owner.equals(p))) {
                    kingindex = i;
                }
            }
        }
        if(Player.iskish(p).isEmpty())
        {
            return false;
        }
        for(int i=7;i<=9;i++){
            if(kingindex+i<65)
            {
                if (FXMLDocumentController.houses[kingindex].piece.Move(FXMLDocumentController.houses[kingindex],FXMLDocumentController.houses[ kingindex+i]) && Player.iskish(p, kingindex+i).isEmpty())
                    return false;
            }
            if(kingindex-i>0)
            {
                if(FXMLDocumentController.houses[kingindex].piece.Move(FXMLDocumentController.houses[kingindex],FXMLDocumentController.houses[ kingindex-i]) && Player.iskish(p, kingindex-i).isEmpty())
                    return false;
            }
        }
        if (FXMLDocumentController.houses[kingindex].piece.Move(FXMLDocumentController.houses[kingindex],FXMLDocumentController.houses[ kingindex+1]) && Player.iskish(p, kingindex+1).isEmpty())
            return false;
        if (FXMLDocumentController.houses[kingindex].piece.Move(FXMLDocumentController.houses[kingindex],FXMLDocumentController.houses[ kingindex-1]) && Player.iskish(p, kingindex-1).isEmpty())
            return false;
        if(!Player.iskish(p).isEmpty())
        {
            ArrayList<House> checkpath=Player.iskish(p);
            for(int i=1;i<65;i++)
            {
                if(FXMLDocumentController.houses[i].piece!=null && FXMLDocumentController.houses[i].piece.owner.equals(p))
                {

                    for(int j=0;j<checkpath.size();j++)
                    {
                        if(checkpath.get(j).piece!=null && FXMLDocumentController.houses[i].piece.Move(FXMLDocumentController.houses[i], checkpath.get(j)))
                        {
                            return false;
                        }
                    }

                }
            }
        }
        return true;
    }
    public static ArrayList< House> iskish(Player p,int kingindex) {
        isChecked = false;
        ArrayList<House> arraylist=new ArrayList<>();
        int newindex = 0;
        newindex = kingindex;
        int count = 0;
        while (newindex % 8 != 0) {
            newindex++;
            count++;
        }
        newindex = kingindex;
        int i=0;
        for (i = 1; i <= count; i++) {
            newindex++;
            if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                    isChecked=true;
                    break;
                }
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {
                try{
                    arraylist.add(FXMLDocumentController.houses[newindex]);
                }catch(NullPointerException e)
                {
                    System.out.println("Caught NullPointerException");
                }catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Caught ArrayIndexOutOfBoundsException ");
                }

                newindex++;
            }
            return arraylist;
        }

        newindex = kingindex;
        count = 0;
        while (newindex - 1 % 8 != 0) {
            newindex--;
            count++;
        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex--;
            if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                    isChecked=true;
                    break;
                }
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {
                System.out.println("Caught NullPointerException");
            }
                newindex--;
            }
            return arraylist;
        }


        newindex = kingindex;
        count = 0;
        while (newindex+8 <= 64) {
            newindex += 8;
            count++;

        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex += 8;
            try{
                if ((FXMLDocumentController.houses[newindex].piece != null)) {


                    if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                        isChecked=true;
                        break;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=8;
            }
            return arraylist;
        }

        newindex = kingindex;
        count = 0;
        while (newindex-8 >= 1) {
            newindex -= 8;
            count++;
        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex -= 8;
            try{
                if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                    if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                        isChecked=true;
                        break;
                    }

                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {    try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=8;
            }
            return arraylist;
        }


        //ghotri
        newindex = kingindex;
        count=0;
        while(newindex-7>0 && newindex %8 !=0)
        {
            newindex -=7;
            count++;
        }
        newindex=kingindex;
        for( i=1 ;i<=count;i++)
        {
            newindex -=7;
            try{
                if((FXMLDocumentController.houses[newindex].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                    isChecked=true;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }
        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=7;
            }
            return arraylist;
        }



        newindex = kingindex;
        count=0;
        while(newindex-9>0 && (newindex-1)%8!=0)
        {
            newindex-=9;
            count++;
        }
        newindex= kingindex;
        for( i=1;i<=count;i++)
        {
            newindex-=9;
            try{
                if((FXMLDocumentController.houses[newindex].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                    isChecked=true;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException E)
            {

            }
        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=9;
            }
            return arraylist;
        }


        newindex=kingindex;
        count=0;
        while(newindex+9<65 && newindex%8 !=0)
        {
            newindex+=9;
            count++;
        }
        newindex = kingindex;
        for( i=1;i<=count;i++)
        {
            newindex+=9;

            if((FXMLDocumentController.houses[newindex].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                isChecked=true;
                break;
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=9;
            }
            return arraylist;
        }



        newindex=kingindex;
        count=0;
        while(newindex+7<65 && (newindex-1)%8!=0)
        {
            newindex+=7;
            count++;
        }
        newindex=kingindex;
        for(i=1;i<=count;i++)
        {
            newindex+=7;

            if((FXMLDocumentController.houses[newindex].piece!=null)&&FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                isChecked=true;
                break;
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=7;
            }
            return arraylist;
        }

        newindex=kingindex;
        try{
            if((FXMLDocumentController.houses[newindex-15].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-15].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;

                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }

            if((FXMLDocumentController.houses[newindex+15].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+15].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-17].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-17].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-10].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-10].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-6].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-6].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+10].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+10].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+17].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+17].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+6].piece!=null)&& FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+6].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
        }catch(ArrayIndexOutOfBoundsException e){

        }catch(NullPointerException e)
        {

        }


        //pawn
        newindex=kingindex;
        try{
            if(FXMLDocumentController.turn%2==0)
            {
                if(FXMLDocumentController.houses[newindex-7].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex-7].piece.index==0 && !FXMLDocumentController.houses[newindex-7].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex-7]);
                    return arraylist;
                }
                if(FXMLDocumentController.houses[newindex-9].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex-9].piece.index==0 && !FXMLDocumentController.houses[newindex-9].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex-9]);
                    return arraylist;
                }
            }
            if(FXMLDocumentController.turn%2==1)
            {
                if(FXMLDocumentController.houses[newindex+7].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex+7].piece.index==0 && !FXMLDocumentController.houses[newindex+7].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex+7]);
                    return arraylist;
                }
                if(FXMLDocumentController.houses[newindex+9].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex+9].piece.index==0 && !FXMLDocumentController.houses[newindex+9].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex+9]);
                    return arraylist;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {

        }
        catch(NullPointerException e)
        {

        }


        return arraylist;

    }
    public static ArrayList< House> iskish(Player p) {
        isChecked = false;
        ArrayList<House> arraylist=new ArrayList<>();
        int kingindex = 0;
        int newindex = 0;
        for (int i = 1; i < 65; i++) {
            if(FXMLDocumentController.houses[i].piece!=null)
            {
                if ((FXMLDocumentController.houses[i]
                        .piece.index == 5) && (FXMLDocumentController
                        .houses[i].piece
                        .owner.equals(p))) {
                    kingindex = i;
                }
            }
        }
        newindex = kingindex;
        int count = 0;
        while (newindex % 8 != 0) {
            newindex++;
            count++;
        }
        newindex = kingindex;
        int i=0;
        for (i = 1; i <= count; i++) {
            newindex++;
            if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                if (FXMLDocumentController.houses[newindex].piece.Move(
                        FXMLDocumentController.houses[newindex],
                        FXMLDocumentController.houses[kingindex])&&
                        ((FXMLDocumentController.houses[newindex].piece.index == 3) ||
                                (FXMLDocumentController.houses[newindex].piece.index == 4)) &&
                        !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                    isChecked=true;
                    break;
                }
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {
                try{
                    arraylist.add(FXMLDocumentController.houses[newindex]);
                }catch(NullPointerException e)
                {
                    System.out.println("Caught NullPointerException");
                }catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Caught ArrayIndexOutOfBoundsException ");
                }

                newindex++;
            }
            return arraylist;
        }

        newindex = kingindex;
        count = 0;
        while (newindex - 1 % 8 != 0) {
            newindex--;
            count++;
        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex--;
            if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                    isChecked=true;
                    break;
                }
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {
                System.out.println("Caught NullPointerException");
            }
                newindex--;
            }
            return arraylist;
        }


        newindex = kingindex;
        count = 0;
        while (newindex+8 <= 64) {
            newindex += 8;
            count++;

        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex += 8;
            try{
                if ((FXMLDocumentController.houses[newindex].piece != null)) {


                    if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                        isChecked=true;
                        break;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=8;
            }
            return arraylist;
        }

        newindex = kingindex;
        count = 0;
        while (newindex-8 >= 1) {
            newindex -= 8;
            count++;
        }
        newindex = kingindex;
        for ( i = 1; i <= count; i++) {
            newindex -= 8;
            try{
                if ((FXMLDocumentController.houses[newindex].piece != null) ) {

                    if (FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex].piece.index == 3) || (FXMLDocumentController.houses[newindex].piece.index == 4)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p))) {
                        isChecked=true;
                        break;
                    }

                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {    try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=8;
            }
            return arraylist;
        }


        //ghotri
        newindex = kingindex;
        count=0;
        while(newindex-7>0 && newindex %8 !=0)
        {
            newindex -=7;
            count++;
        }
        newindex=kingindex;
        for( i=1 ;i<=count;i++)
        {
            newindex -=7;
            try{
                if((FXMLDocumentController.houses[newindex].piece!=null)&&FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                    isChecked=true;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {

            }
        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=7;
            }
            return arraylist;
        }



        newindex = kingindex;
        count=0;
        while(newindex-9>0 && (newindex-1)%8!=0)
        {
            newindex-=9;
            count++;
        }
        newindex= kingindex;
        for( i=1;i<=count;i++)
        {
            newindex-=9;
            try{
                if((FXMLDocumentController.houses[newindex].piece!=null)&& FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                    isChecked=true;
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException E)
            {

            }
        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex-=9;
            }
            return arraylist;
        }


        newindex=kingindex;
        count=0;
        while(newindex+9<65 && newindex%8 !=0)
        {
            newindex+=9;
            count++;
        }
        newindex = kingindex;
        for( i=1;i<=count;i++)
        {
            newindex+=9;

            if((FXMLDocumentController.houses[newindex].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                isChecked=true;
                break;
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=9;
            }
            return arraylist;
        }



        newindex=kingindex;
        count=0;
        while(newindex+7<65 && (newindex-1)%8!=0)
        {
            newindex+=7;
            count++;
        }
        newindex=kingindex;
        for(i=1;i<=count;i++)
        {
            newindex+=7;

            if((FXMLDocumentController.houses[newindex].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&(((FXMLDocumentController.houses[newindex].piece.index == 4) || (FXMLDocumentController.houses[newindex].piece.index ==2)) && !(FXMLDocumentController.houses[newindex].piece.owner.equals(p)))) {
                isChecked=true;
                break;
            }

        }
        if(isChecked)
        {
            newindex=kingindex;
            for(int j=1;j<=i+1;j++)
            {   try{
                arraylist.add(FXMLDocumentController.houses[newindex]);
            }catch(NullPointerException e)
            {

            }
                newindex+=7;
            }
            return arraylist;
        }

        newindex=kingindex;
        try{
            if((FXMLDocumentController.houses[newindex-15].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-15].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;

                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }

            if((FXMLDocumentController.houses[newindex+15].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& ((FXMLDocumentController.houses[newindex+15].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-17].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-17].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-10].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-10].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex-6].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex-6].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+10].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+10].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+17].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+17].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
            if((FXMLDocumentController.houses[newindex+6].piece!=null) && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&&((FXMLDocumentController.houses[newindex+6].piece.index==1) &&!(FXMLDocumentController.houses[newindex].piece.owner.equals(p))))
            {
                isChecked=true;
                arraylist.add(FXMLDocumentController.houses[newindex]);
                return arraylist;
            }
        }catch(ArrayIndexOutOfBoundsException e){

        }catch(NullPointerException e)
        {

        }


        //pawn
        newindex=kingindex;
        try{
            if(FXMLDocumentController.turn%2==0)
            {
                if(FXMLDocumentController.houses[newindex-7].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex-7].piece.index==0 && !FXMLDocumentController.houses[newindex-7].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex-7]);
                    return arraylist;
                }
                if(FXMLDocumentController.houses[newindex-9].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex-9].piece.index==0 && !FXMLDocumentController.houses[newindex-9].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex-9]);
                    return arraylist;
                }
            }
            if(FXMLDocumentController.turn%2==1)
            {
                if(FXMLDocumentController.houses[newindex+7].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex+7].piece.index==0 && !FXMLDocumentController.houses[newindex+7].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex+7]);
                    return arraylist;
                }
                if(FXMLDocumentController.houses[newindex+9].piece!=null && FXMLDocumentController.houses[newindex].piece.Move(FXMLDocumentController.houses[newindex],FXMLDocumentController.houses[kingindex])&& FXMLDocumentController.houses[newindex+9].piece.index==0 && !FXMLDocumentController.houses[newindex+9].piece.owner.equals(p))
                {
                    isChecked=true;
                    arraylist.add(FXMLDocumentController.houses[newindex+9]);
                    return arraylist;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {

        }
        catch(NullPointerException e)
        {

        }


        return arraylist;

    }
}