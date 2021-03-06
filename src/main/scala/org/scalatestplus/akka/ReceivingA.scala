/*
 * Copyright 2016 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatestplus.akka

import scala.concurrent.Future
import scala.reflect.ClassTag

import org.scalatest.Assertion
import org.scalatest.concurrent.PatienceConfiguration
import org.scalatest.time.Span

/**
 * Create async versions of expectMsgType, which has this signature and description:
 *
 * def expectMsgType[T: Manifest](d: Duration)
 *
 * An object which is an instance of the given type (after erasure) must be received within
 * the allotted time frame; the object will be returned.
 *
 * Please implement eight methods, with these signatures:
 *
 * def receivingA[T: ClassTag](implicit config: PatienceConfig): Future[T]
 * def receivingAn[T: ClassTag](implicit config: PatienceConfig): Future[T]
 *
 * def receivingA[T: ClassTag](span: Span): Future[T]
 * def receivingAn[T: ClassTag](span: Span): Future[T]
 *
 * def assertingReceiveA[T: ClassTag](implicit config: PatienceConfig): Future[Assertion]
 * def assertingReceiveAn[T: ClassTag](implicit config: PatienceConfig): Future[Assertion]
 *
 * def assertingReceiveA[T: ClassTag](span: Span): Future[Assertion]
 * def assertingReceiveAn[T: ClassTag](span: Span): Future[Assertion]
 */
trait ReceivingA extends PatienceConfiguration {

  def receivingA[T: ClassTag](implicit config: PatienceConfig): Future[T] = ???
  def receivingAn[T: ClassTag](implicit config: PatienceConfig): Future[T] = ???

  def receivingA[T: ClassTag](span: Span): Future[T] = ???
  def receivingAn[T: ClassTag](span: Span): Future[T] = ???

  def assertingReceiveA[T: ClassTag](implicit config: PatienceConfig): Future[Assertion] = ???
  def assertingReceiveAn[T: ClassTag](implicit config: PatienceConfig): Future[Assertion] = ???

  def assertingReceiveA[T: ClassTag](span: Span): Future[Assertion] = ???
  def assertingReceiveAn[T: ClassTag](span: Span): Future[Assertion] = ???
}

