package me.nashiroaoi.exchangebot.command

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent
import me.nashiroaoi.exchangebot.internal.MoneyCodes
import net.dv8tion.jda.api.EmbedBuilder

class SearchCurrency: Command(){
    init {
        this.name = "search"
        this.arguments = "[key]"
    }
    
    override fun execute(event : CommandEvent?) {
        if(event?.args?.isNotEmpty()==true){
            event.args.let {key->
                val result = MoneyCodes.findByCurrency(key.toString())
                val embed = EmbedBuilder().also { embed->
                    embed.setTitle(":mag: ${event.args} の検索結果 (${result.count()}件)")
                    for(l in result){
                        embed.addField("${l.country}/${l.currency}",l.name,false)
                    }
                }
                embed.build().let { event.reply(it) }
            }
            
        }
    }
}