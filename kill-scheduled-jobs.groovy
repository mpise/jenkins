import hudson.model.*
def queue = Jenkins.instance.queue

queue.items.each {
  if ((it !=~ "release/") || (it !=~ "hotfix/")  ) {
    queue.cancel(it.task) 
    println "Cancelling ..." + it;
  }
}
