package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Byt$Q;
import CC.$.Q$Q_LMNt.Q$Flot;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Byt$FlOt extends Byt$Q,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(Byt$FlOt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float Byt$Flot(byte In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Flotg(byte[] From,float[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Byt$Flot(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default float[] Bytg$Flotg(byte[] In)
			{
				float[] Out=new float[In.length];
				Bytg$Flotg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Flotg(Iterable<Byte> From,Collection<Float> To){for(byte In:From){To.add(Byt$Flot(In));}}
}