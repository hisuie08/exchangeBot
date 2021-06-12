package me.nashiroaoi.exchangebot.command

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent
import me.nashiroaoi.exchangebot.internal.MoneyCodes
import me.nashiroaoi.exchangebot.internal.get
import net.dv8tion.jda.api.EmbedBuilder
import org.junit.jupiter.api.Test
import java.awt.Color

class Exchange: Command(){
    init {
        this.name = "exchange"
        this.arguments = "<base> <target> <amount>"
    }
    
    override fun execute(event : CommandEvent?) {
        val embed = EmbedBuilder().also { it.setFooter("worked by coinbase.com") }
        val args = event?.args?.split(Regex("[\u0020,]"))!!
        
        if(args.count() < 2){
            embed.also {
                it.setColor(Color.red)
                it.setTitle(":warning: エラー")
                it.setDescription(
                    "引数が不正です\n```exchange [base] [target] [amount(任意)]```\nの形で入力してください"
                )
            }
            
        }else{
            val baseCode = args[0].uppercase()
            val targetCode = args[1].uppercase()
            var amount =1F
            try {amount = args[2].toFloat()}catch(e:Exception){}
            
            val result = get(baseCode)
            when{
                result == null->{
                    embed.setTitle(":warning: エラー")
                    embed.setColor(Color.red)
                    embed.setDescription("通貨コード $baseCode が見つかりませんでした。")
                }
                result.data?.rates?.get(targetCode) != null->{
                    result.data.rates[targetCode]!!.toFloat().let {
                        embed.addField(
                            "${it* amount} ${MoneyCodes.valueOf(targetCode).currency}"
                            , MoneyCodes.valueOf(targetCode).country,false)
                    }
                }
            }
        }
        event.reply(embed.build())
    }
}

