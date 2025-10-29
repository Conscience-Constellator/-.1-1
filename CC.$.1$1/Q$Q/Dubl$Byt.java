package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$Byt;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl$Byt extends Dubl$Q,Q$Byt
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte Dubl$Byt(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Bytg(double[] From,byte[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Dubl$Byt(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default byte[] Dublg$Bytg(double[] In)
			{
				byte[] Out=new byte[In.length];
				Dublg$Bytg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Bytg(Iterable<Double> From,Collection<Byte> To){for(double In:From){To.add(Dubl$Byt(In));}}
}