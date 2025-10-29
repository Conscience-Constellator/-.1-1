package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.Get_Q_By_Byt;
//import CC.$.Q$Q_LMNt.Byt$Q;
//import CC.$.Q$Q_LMNt.Q$ChR;
import java.util.Collection;

public interface Byt$ChR //extends Byt$Q,Q$ChR
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Byt$ChR.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_Dclar
	char Byt$ChR(byte In);
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Bytg$ChRg(
			byte[] From,
			char[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=
				(Byt$ChR(From[IndX]));
			}
		}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default char[] Bytg$ChRg(byte[] In)
			{
				char[] Out=new char[In.length];

				Bytg$ChRg(In,Out);

				return Out;
			}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Bytg$ChRg(Iterable<Byte> From,Collection<Character> To)
		{
			for(byte In:From)
			{To.add(Byt$ChR(In));}
		}
}